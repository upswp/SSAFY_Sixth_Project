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
	<title>SSAFY-글수정</title>
	
	
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
	<div class="col-lg-6" align="center">
		<h2>방명록 글수정</h2>
		<form id="modifyform" method="post" action="">
		<input type="hidden" name="articleno" id="articleno" value="${article.articleno}">
			<div class="form-group" align="left">
				<label for="subject">제목:</label>
				<input type="text" class="form-control" id="subject" name="subject" value="${article.subject}">
			</div>
			<div class="form-group" align="left">
				<label for="content">내용:</label>
				<textarea class="form-control" rows="15" id="content" name="content">${article.content}</textarea>
			</div>
			<button type="button" id="modifyBtn" class="btn btn-primary">글수정</button>
			<button type="reset" class="btn btn-warning">초기화</button>
		</form>
	</div>
</div>

<!-- contents end -->



 <script type="text/javascript">
  $(document).ready(function() {
	  $("#modifyBtn").click(function() {
			if($("#subject").val() == "") {
				alert("제목 입력!!!");
				return;
			} else if($("#content").val() == "") {
				alert("내용 입력!!!");
				return;
			} else {
				$("#modifyform").attr("action", "${root}/article/modify").submit();
			}
		});
	});
  </script>
<!-- footer호출 -->
<jsp:include page="../common/footer.jsp" />

</body>
</html>
</c:if>