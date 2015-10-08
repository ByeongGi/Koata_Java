<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/board.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="form-main">
			<form class="form-horizontal" method="post" action="loginok">
				<input name="url" id ="url" type="hidden" value="${param.url}" />
				<input name="no" id ="no" type="hidden" value="${param.no}" />
				<div class="form-group">
					<div class="un-wrap">
						<input type="text" class="form-control" placeholder="id" name="id"
							id="id" required="required">
					</div>
					<div class="pw-wrap">
						<input type="password" class="form-control" name="pwd" id="pwd"
							placeholder="Password" required="required">
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="checkbox">
								<label> <input type="checkbox"> Remember me
								</label>
							</div>
						</div>
					</div>
					<div class="row top-buffer">
						<div class="col-md-4 col-md-offset-8">
							<button type="submit" class="btn btn-primary btn-lg btn-block">
								Log in</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>