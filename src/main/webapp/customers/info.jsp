<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<table>
    <fieldset>
        <lenged>${customer.name}</lenged>
        <tr>
            <td>ID</td>
            <td>${customer.id}</td>
        </tr>
        <td>Name</td>
        <td>${customer.name}</td>
        </tr>
        <td>Email</td>
        <td>${customer.email}</td>
        </tr>
        <td>Address</td>
        <td>${customer.address}</td>
        </tr>
    </fieldset>
</table>

</body>
</html>