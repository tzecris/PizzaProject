<%-- 
    Document   : ordermapping
    Created on : 31 Μαρ 2020, 8:07:04 μμ
    Author     : Admin
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Pizza</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>

        <form:form action="order/submitOrder" method="POST" modelAttribute="order">
            <p><strong>Choose bread size:</strong></p>
            <form:radiobuttons path="pizza.size" items="${sizes}" itemLabel="sname"/>
            

            <p><b>Choose Ingredients</b></p>
            <form:checkboxes items="${ingredients}" path="pizza.ingredients" itemLabel="iname"/>
<!--            <input type="checkbox" name="ingredients" value="Potatoes">Potatoes<br/>
            <input type="checkbox" name="ingredients" value="Tomatoes">Tomatoes<br/>
            <input type="checkbox" name="ingredients" value="Sausage">Sausage<br/>-->

            <p><strong>Choose payment method:</strong></p>
            <select name="payment">
                <option value="Credit Card">Credit Card</option>
                <option value="Cash">Cash</option>
                <option value="Bitcoin">Bitcoin</option>
                <option value="Paypal">Paypal</option>
            </select>
            
            <p><strong>Your details:</strong></p>
            Name: <input type="text" name="name"/><br/>
            Age <input type="number" name="age"/><br/><br/>
            <input type="submit" value="Submit"/><br/>
        </form:form>

    </body>
</html>
