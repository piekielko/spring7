<%@ include file="./includes/common.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
	<h1>Strona główna</h1>
	<ul>
		<li>
			<a href="<c:url value="/addEntry.do" />" >Dodaj wpis</a>
		</li>
		<li>
			<a href="<c:url value="/generateReport.do" />" >Generuj raport PDF</a>
		</li>
	</ul>
</body>
</html>