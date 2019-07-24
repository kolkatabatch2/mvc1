<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="add" method="post">
     <table>
     <tr>
       <td>BOOK NO</td><td><input type="text" name="id" id="id"/></td>
     </tr>
       <tr>
       <td>BOOK NAME</td><td><input type="text" name="name" id="name"/></td>
     </tr>
     <tr>
       <td colspan="2"><input type="submit" value="add"/>     </td>
     </tr>
     </table>
     </form>
     <table>
     <c:forEach items="${books}" var="book">
          <tr><td>${book.id}</td></tr>
          <tr><td>${book.name}</td></tr>
     </c:forEach>
     </table>
</body>
</html>