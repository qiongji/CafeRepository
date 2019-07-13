<%--
  Created by IntelliJ IDEA.
  User: dnn15
  Date: 2019-07-10
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />

    <script type="text/javascript" src="lib/layui/layui.js"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>

    <link rel="stylesheet"  type="text/css" href="lib/layui/css/layui.css"/>


    <script type="text/javascript">
        function checkname(){
            var reg=/^[\u4E00-\u9FA5]{1,6}$/;	//输入1~6位的字符
            if($("#eTelephone").val()==""){
                layer.msg("请输入手机号!",{icon:6,time:1000});
                return false;
            }else{
                if(reg.test($("#eTelephone").val())){
                    return true;
                }else{
                    layer.msg("请输入正确的手机号!",{icon:6,time:1000});
                    return false;	//1:对号 2:叉号 3:问号 4:锁 5:哭脸 6:笑脸7:感叹号
                }
            }
        }
        function checkpwd(){
            var reg=/^(\w|\d){6,12}$/;			//输入6~12位
            if($("#ePassword").val()!=""){
                if(reg.test($("#ePassword").val())){
                    return true;
                }else{
                    layer.msg("请输入6~12位登录密码!",{icon:7,time:1000});
                    return false;
                }
            }else{
                layer.msg("请输入登录密码!",{icon:7,time:1000});
                return false;
            }
        }

        function checkall(){
            //判断验证是否通过
            if(checkname()&&checkpwd()){
                alert("验证通过");
                $.post("front/login",$("#logfrm").serialize(),function(data){
                    if(data==1){
                        alert("登录成功");
                        location.href="show.jsp";

                    }else{
                        layer.msg("登录失败!", {icon: 5,time:1200});
                    }
                });
            }
        }
        $(function(){
            //禁用浏览器后退按钮
            history.pushState(null,null,document.URL);
            window.addEventListener("popstate",function(){
                history.pushState(null,null,document.URL)
            });
        })
    </script>
</head>
<body>
    <div id="container">
        <form id="logfrm">
            <div class="login">咖啡厅管理系统</div>
            <div class="username-text">手机号:</div>
            <div class="password-text">密  码:</div>
            <div class="username-field">
                <input type="text" id="eTelephone" name="eTelephone" onblur="checkname()" />
            </div>
            <div class="password-field">
                <input type="password" id="ePassword" name="ePassword" onblur="checkpwd()"/>
            </div>
            <input type="checkbox" name="remember-me" id="remember-me" /><label for="remember-me">记住我</label>
            <div class="forgot-usr-pwd"> <a href="#"></a> <a href="#"></a></div>
            <input type="submit" name="submit" value="登录" onclick="checkall()" />
        </form>
    </div>
    <div id="footer">
    </div>
</body>
</html>
