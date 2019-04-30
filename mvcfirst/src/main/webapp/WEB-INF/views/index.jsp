
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
</body>


<form action="addUser">

<table>
<tr>
<td>FIRSTNAME</td><td><input type="text" name="firstname"/></td>
</tr>
<tr>
<td>LASTNAME</td><td><input type="text" name="lastname"/></td>
</tr>
<tr>
   <td><input type="submit" value="add"/></td>
</tr>
</table>
</form>

Hello ${employee}

</body>
</html>
