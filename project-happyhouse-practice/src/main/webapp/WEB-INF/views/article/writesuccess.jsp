<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<c:if test="${userinfo == null}">
	<c:redirect url="/"/>
</c:if>
<c:if test="${userinfo != null}">
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SSAFY-글작성성공</title>
	
	
	<!-- header호출 -->
	<jsp:include page="../common/header.jsp" />
	<!-- js호출 -->
<!-- 	<script type="text/javascript" src ="../js/join.js"></script> -->
</head>
<body>
<!-- nav 호출 -->
<jsp:include page="../common/nav.jsp" />

<!-- contents start -->
<div class="container" align="center">
	<div class="col-lg-6" align="right">
	<strong>${userinfo.username}</strong>님 환영합니다.
	<a href="${root}/user/logout">로그아웃</a>
	</div>
	<div class="col-lg-6">
	  <div class="jumbotron">
	    <h1>글작성 성공!!!</h1>      
	  </div>  
	  <p><a href="${root}/article/list?pg=1&key=&word=">글목록</a></p>
	</div>
</div>

<!-- contents end -->


<!-- footer호출 -->
<jsp:include page="../common/footer.jsp" />

</body>
</html>
</c:if>