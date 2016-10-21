<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8" %>
<%@include file="../common/commonHeader.jsp" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
${index.Name}

<form action="loginAction">
	<input type="text" id="userName" name="userName" maxlength="20">
	<input type="password" id="password" name="password" maxlength="40">
	<button id="submit">提交</button>
</form>
</body>
</html>
<script>
$(function() {
    $("#submit").click(function() {
        var json = {
              'username':$('#userName').val(),
              'password':$('#password').val()
        };
        //json字符串 {"username":"admin","password":"123456"}
        var postdata = JSON.stringify(json);
        alert(postdata);
        $.ajax({  
                type : 'POST',  
                contentType : 'application/json',
                processData : false,
                url : '/user/login',
                dataType : 'json',  
                data : postdata,  
                success : function(data) {  
                   alert('username : '+data.username+'\npassword : '+data.password);  
                }
        }); 
   });
});
</script>