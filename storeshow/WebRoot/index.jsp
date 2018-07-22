<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>欢迎来到王者荣耀寻宝</h1>
<h3>
<a href="${ pageContext.request.contextPath }/ProductFindAllServlet">查询所有宝贝</a>|
<a href="${ pageContext.request.contextPath }/ProductFindByPageServlet?currPage=1">分页查询宝贝</a>
</h3>
</body>
</html>