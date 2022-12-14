<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
<div  align="center"    class="loginForm">

    <form action="http://localhost:8080/RTweb3_war_exploded/login/mlogin" method="post">
    账户<input class="input" id="userName" name="userName" type="text"><br>
    密码<input id="passWord" name="passWord" type="password"><br>
        <input type="submit"value="登录" >
    </form>
<form action="http://localhost:8080/RTweb3_war_exploded/register/test">
    <input type="submit"value="注册" >
</form>


</div>


</body>
</html>