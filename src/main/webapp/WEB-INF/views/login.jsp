<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<c:if test="${param.error ne null}">
	<div class="alert alert-danger">
		<strong>Invalid username and password!</strong>
	</div>
</c:if>
<c:if test="${param.logout ne null}">
	<div class="alert alert-danger">
		<strong>You have been logged out!</strong>
	</div>
</c:if>


<div class="row login-container">
	<div class="col-md-6 col-md-offset-3">
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<a href="#" class="active" id="login-form-link">Login</a>
					</div>
					<div class="col-xs-6">
						<a href="#" id="register-form-link">Register</a>
					</div>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						<%--<form id="login-form" action="https://phpoll.com/login/process" method="post" role="form" style="display: block;">--%>
							<spring:url value="/login" var="securityCheckUrl" />
							<form:form action="${securityCheckUrl}" method="post" id="login-form" role="form">
							<div class="form-group">
								<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="<c:out value='${user}'/>">
							</div>
							<div class="form-group">
								<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
							</div>
							<div class="form-group text-center">
								<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
								<label for="remember"> Remember Me</label>
							</div>
							<div class="form-group">
								<div class="row">
									<div class="col-sm-6 col-sm-offset-3">
										<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="row">
									<div class="col-lg-12">
										<div class="text-center">
											<a href="#" tabindex="5" class="forgot-password">Forgot Password?</a>
										</div>
									</div>
								</div>
							</div>
							</form:form>
						<%--<form id="register-form" action="https://phpoll.com/register/process" method="post" role="form" style="display: none;">--%>
							<spring:url value="/addUser" var="addUser" />
							<form:form action="${addUser}" method="post" id="register-form" role="form" style="display: none;">
							<div class="form-group">
								<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
							</div>
							<div class="form-group">
								<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
							</div>
							<div class="form-group">
								<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
							</div>
							<div class="form-group">
								<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
							</div>
							<div class="form-group">
								<div class="row">
									<div class="col-sm-6 col-sm-offset-3">
										<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
									</div>
								</div>
							</div>
							</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>