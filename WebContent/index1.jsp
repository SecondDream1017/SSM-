<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联系</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.0.js"></script>
<script type="text/javascript">

function saveUser(){
	//alert("saveUser")
	var objdata = JSON.stringify({"username":"jack","sex":"1","address":"1111"});
	$.ajax({
		type:'POST',
		url:'/SSM/user/saveUser.do',
		data:objdata,
		contentType:'application/json;charset=utf-8',
		success:function(data){
			alert(data);
		}
	})
}

$(function(){
	//alert("jQuery");
});

</script>
</head>
<body>
${pageContext.request.contextPath }
	<!-- <form action="/0809/DemoS1" method="post">
		姓名:<input type="text" name="username"><br>
		性别:<input type="radio" name="sex" value="male">男
			<input type="radio" name="sex" value="female">女<br>
		所在地:<select name="city">
				<option value="bj">北京
				<option value="sh">上海
			</select><br>
		爱好:<input type="checkbox" name="hobby" value="run">跑步
			<input type="checkbox" name="hobby" value="swim">游泳<br>
			
		<input type="submit" value="提交">
	</form> -->
	<button onclick="saveUser()">点击</a>
	
</body>
</html>