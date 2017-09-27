<%-- 
    Document   : calculator
    Created on : Sep 26, 2017, 6:00:50 PM
    Author     : 686623
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Calculator</title>
    </head>
    <body>
        <h1>Simple JSP Calculator</h1>
        <form action="Calculator" method="post">
            Input the first number: <input type="text" name="num1"><br>
            Input the second number: <input type="text" name="num2"><br>
            <select name="operator">
                <option value="+"> + </option>
                <option value="-"> - </option>
                <option value="*"> * </option>
                <option value="%"> % </option>
            </select>
            <input type="submit" value="Caclulate">
            ${result}
   
        </form>
    </body>
</html>
