<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />

<title>Login画面</title>

<style type="text/css">

body {
  margin:0;
  padding:0;
  line-height:1.6;
  letter-spacing:1px;
  font-family:"Feijoa",serif;
  font-size:12px;
  color:#333;
  background:#fff;
  }

table {
  text-align:center;
  margin:0 auto;
  }

 #top {
   width:780px;
   margin:30px auto;
   }

   #top,h3 {
  margin-top:40px;
   }

#header {
  width: 100%;
  height: 80px;
  background-color: black;}

#main {
  width: 100%;
  height: 500px;
  text-align: center;
  background-image:url("https://castle.womany.net/images/content/pictures/34591/content_womany_c6349d66d35ee673af355ae094c3d7c3_1443170926-9368-9420.jpg");
  background-repeat:no-repeat;
  background-position:center center;
  background-size:contain;
  background-color:#FFF;}

#footer {
  width: 100%;
  height: 80px;
  background-color: black;
  clear:both;
  margin-top:40px;}

#text-link {
display: inline-block;
text-align: right;
}

</style>
</head>

<body>

  <div id="header">
    <div id="pr"></div>
  </div>

  <div id="main">

    <div id = "top">
       <br>
       <h3>Welcome</h3>

       <s:form action="LoginAction">
          <s:textfield name="loginUserId"/>
          <s:password name="loginPassword"/>
          <s:submit value=" Log In "/>
       </s:form>
       <br/>

      <div id="text-link">
           <p>New customer?
             <a href='<s:url action="UserCreateAction" />'>Start here.</a></p>
           <p>Home
             <a href='<s:url action="GoHomeAction" />'> ← </a></p>
      </div>
    </div>
  </div>

  <div id="footer">
    <div id="pr"></div>
  </div>

</body>
</html>