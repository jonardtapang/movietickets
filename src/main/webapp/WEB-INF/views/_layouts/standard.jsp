<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Cache-Control" content="private" />
	<meta http-equiv="Expires" content="86400" />
	<title><tiles:insertAttribute name="title"/> - Movie Tickets</title>
	<link href="<c:url value="/favicon.ico" />" rel="icon" type="image/png" />
	<link rel="stylesheet" href="<c:url value="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />" />
	<link type="text/css" rel="stylesheet" href="<c:url value="/styles/main.css" />" />
	<%--<spring:theme var="cssUrl" code="css.bootstrap" />
	<link type="text/css" rel="stylesheet" href="<c:url value="${cssUrl}" />" />--%>
</head>
<body>
<div class="loader-overlay">
	<div class="loader"></div>
</div>
	<nav id="navbar-header" class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand blue" href="/">Movie <span class="yellow">Ticket</span></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<tiles:importAttribute name="navigationTab" />
				<ul class="nav navbar-nav">
					<li class="${navigationTab eq 'home' ? 'active' : ''}"><a href="<c:url value="/" />">HOME</a></li>
					<security:authorize  var="loggedIn" access="isAuthenticated()" />
						<c:choose>
							<c:when test="${loggedIn}">
								<li class="">
									<c:url var="logoutUrl" value='/logout' />
									<a href="${logoutUrl}"
									   onclick="getElementById('_logoutForm').submit(); return false;">LOGOUT</a>
										<%--
                                            Because CSRF is enabled, and a token is expected, a logout link will
                                            not be enough. You'll need to use a POST. You can do this by creating
                                            a hidden form that is submitted when the logout link is clicked.
                                            Use Spring form:form tag when creating this hidden logout form
                                            to automatically include the CSRF token.
                                        --%>
									<form:form id="_logoutForm" action="${logoutUrl}" method="POST" cssClass="hidden"></form:form>
								</li>
							</c:when>
							<c:otherwise>
								<li class="">
									<c:url var="loginUrl" value='/login' />
									<a href="${loginUrl}">LOGIN</a>
								</li>
							</c:otherwise>
						</c:choose>


				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li>

					</li>
					<li>
					</li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container">

		<tiles:insertAttribute name="main" />

	</div>
	<footer id="footer" class="footer">
		<div class="container">
			<p class="text-muted">Developed By: Developer</p>
		</div>
    </footer>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value='/webjars/jquery/3.1.1/jquery.min.js' />"></script>
<script src="<c:url value='/scripts/slick.js' />"></script>
<script src="<c:url value='/scripts/app.js' />"></script>
</body>
</html>
