<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<script type="text/javascript" src="<%=contextPath %>/assets/js/viewJS/security/register.js"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<form action="${ctx}/registUser.life" class="form-horizontal" method="post">
				<div>
					<div class="form-group">
						<label class="col-sm-1 control-label">用户账号</label>
						<div class="col-sm-3">
							<input type="text" name="userName" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1 control-label">密码</label>
						<div class="col-sm-3">
							<input type="password" name="userPassword" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1 control-label">确认密码</label>
						<div class="col-sm-3">
							<input type="password" name="userPassword2" class="form-control" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1 control-label">邮箱地址</label>
						<div class="col-sm-3">
							<input type="text" name="userEmail" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1 control-label">验证码</label>
						<div class="col-sm-3">
							<div class="input-group">
								<input type="text" name="verifictionCode" class="form-control">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button" id="sendV">发送验证码</button>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div>
					<div class="form-group">
						<button type="submit" class="btn btn-default" id="regBtn">注册</button>
					</div>
				</div>
			</form>
			<button class="btn btn-default" id="queryList">查询列表</button>
			<table id="table">
				
			</table>
		</div>
	</div>
</body>
</html>