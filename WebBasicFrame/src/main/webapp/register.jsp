<%--
  Created by IntelliJ IDEA.
  User: Yitar
  Date: 2015/11/23
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户注册</title>
  </head>
  <body>
    <form method="post" action="user.action">
      用户名：<input type="text" name="username"><br>
      密  码：<input type="password" name="password"><br>
      确认密码：<input type="password" mame="password2"><br>
      <input type="submit" value="提交"/>
    </form><br>
  </body>
</html>
