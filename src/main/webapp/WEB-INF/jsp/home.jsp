<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1 response.setHeader("Pragma", "no-cache"); //HTTP 1.0 response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<title>test page</title>
<body>
	<h1>Welcome to the Inventory management</h1>

	<table>
		<tr>
			<th>Product ID:</th>
			<th>Product name:</th>
			<th>Product quantity:</th>
			<th>Product price :</th>
			<th>Product status:</th>
		</tr>

		<c:forEach items="${products}" var="product">
			<tr>
				<td><c:out value="${product.productId}" /></td>
				<td><c:out value="${product.productName}" /></td>
				<td><c:out value="${product.productQty}" /></td>
				<td><c:out value="${product.productPrice}" /></td>
				<td><c:out value="${product.productStatus}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>

</html>