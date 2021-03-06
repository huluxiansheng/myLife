<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>注册页面</title>
<script type="text/javascript" src="<%=contextPath %>/assets/js/viewJS/security/register.js"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<form action="${ctx}/registUser.life" class="form-horizontal" method="post">
				<div>
					<div class="form-group">
						<label class="col-sm-4 control-label">用户账号</label>
						<div class="col-sm-4">
							<input type="text" name="userName" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">密码</label>
						<div class="col-sm-4">
							<input type="password" name="userPass" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">确认密码</label>
						<div class="col-sm-4">
							<input type="password" name="userPassword2" class="form-control" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">邮箱地址</label>
						<div class="col-sm-4">
							<input type="text" name="userEmail" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">验证码</label>
						<div class="col-sm-4">
							<div class="input-group">
								<input type="text" name="verifictionCode" class="form-control">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button" id="sendV">发送验证码</button>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-4"></div>
					<div class="col-sm-1">
						<button type="submit" class="btn btn-default" id="regBtn">注册</button>
					</div>
					<div class="col-sm-3">
						<button type="button" class="btn btn-default" id="reset">取消</button>
					</div>
				</div>
			</form>
			<table id="table">
				
			</table>
		</div>
	</div>
</body>
</html>