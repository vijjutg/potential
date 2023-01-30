<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>
<form action="detail" method="post">
<h1>SEnd Details of fav person</h1>
firstName <input type="text" name="firstName"/>
<br>
<br>
lastName <input type="text" name="lastName"/>
<br>
<br>
Gender<input type="radio" name="gender">Male
<input type="radio" name="gender">Female
<br>
<br>
Reason <textarea rows="5" cols="25" name="reason"></textarea>
<br>
<br>
Address<textarea rows="5" cols="25" name="address"></textarea>
<br>
<br>
<input type="submit" value="send"/>
</form>
</body>
</html>