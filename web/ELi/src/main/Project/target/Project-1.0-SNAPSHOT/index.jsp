<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form data students</title>
</head>
<body>
<form action="test" method="POST">
    <h3>Registration</h3>
    <h5>Insert data.</h5>
    <label>Name:</label>
    <input name="name"><br>
    <label>Surname:</label>
    <input name="surname"><br>
    <label>Tax ID code:</label>
    <input name="taxIDCode" pattern="[a-zA-Z]{6}[\d]{2}[a-zA-Z][\d]{2}[a-zA-Z][\d]{3}[a-bA-Z]"><br>
    <label for="course">Select course:</label>
    <select id="course" name = "course">
        <option name="firsts">First</option>
        <option name="second">Second</option>
        <option name="third">Third</option>
        <option name="fourth">Fourth</option>
        <option name="fifth">Fifth</option>
    </select>
    <br>
    <input type="submit" value="Send">
</form>
</body>
</html>
