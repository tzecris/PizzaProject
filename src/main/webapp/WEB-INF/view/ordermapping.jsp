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
            <form:radiobuttons path="pizza.size" items="${sizes}" itemLabel="sname" itemValue="id"/>


            <p><b>Choose Ingredients</b></p>
            <form:checkboxes items="${ingredients}" path="pizza.ingredients" itemLabel="iname" itemValue="id"/>


            <p><strong>Choose payment method:</strong></p>
            <form:select path = "payment">
                <form:option value = "NONE" label = "----Select----"/>
                <form:options items = "${payments}" itemLabel="pname" itemValue="id"/>
            </form:select>

            <p><strong>Your details:</strong></p>
            Name: <form:input type="text" name="name" path="customer.name"/><br/>
            Age <form:input type="number" name="age" path="customer.age"/><br/><br/>
            <input type="submit" value="Submit"/><br/>
        </form:form>

    </body>
</html>
