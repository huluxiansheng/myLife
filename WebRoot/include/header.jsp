<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- 设定项目路径  -->
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<% String contextPath = request.getContextPath(); %>
<script type="text/javascript"> var contextPath = "${pageContext.request.contextPath}"; </script>

<!-- javascript 部分 -->
<script type="text/javascript" src="<%=contextPath %>/assets/js/common/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="<%=contextPath %>/assets/js/common/bootstrap.min.js" ></script>
<script type="text/javascript" src="<%=contextPath %>/assets/js/common/bootstrap-table.min.js" ></script>
<script type="text/javascript" src="<%=contextPath %>/assets/js/common/jquery-serializeObject.js" ></script>

<!-- CSS 部分 -->
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/assets/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/assets/css/bootstrap-table.min.css" />





