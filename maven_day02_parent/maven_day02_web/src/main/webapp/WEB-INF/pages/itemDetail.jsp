<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<form>
		<table width="80%" border=1 align="center">
			<caption><h1>商品明细表</h1></caption>
			<tr>
				<th>序号</th>
				<th>商品名称</th>
				<th>商品价格</th>
				<th>生成日期</th>
				<th>商品简介</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list}" var="item" varStatus="s">
				<tr align="center">

					<td align="center"> ${s.index+1} </td>
					<td align="center"> ${item.name } </td>
					<td align="center"> ${item.price } </td>
					<td align="center"> <fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
					<td align="center">${item.detail} </td>
					<td align="center"><a href="delete.do?id=${item.id}">删除 </a> </td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>