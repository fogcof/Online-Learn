<%-- 
    Document   : account
    Created on : May 28, 2022, 6:23:08 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login/Register</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
              integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <c:if test="${requestScope.path == null}">
            <style type="text/css">
                <%@include file="../css/account_login.css"%>
            </style>
        </c:if>
        <c:if test="${requestScope.path eq '/login'}">
            <style type="text/css">
                <%@include file="../css/account_login.css"%>
            </style>
        </c:if>
        <c:if test="${requestScope.path eq '/register'}">
            <style type="text/css">
                <%@include file="../css/account_register.css"%>
            </style>
        </c:if>
    </head>
    <body>
        <div class="account-page mt-5">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="form-container">
                            <div class="form-bt">
                                <span onclick="login()">Login</span>
                                <span onclick="register()">Register</span>
                                <hr id="Indicator">
                            </div>
                            <div id="error" class="error">
                                <c:if test="${requestScope.err_log != null}">
                                    <p style="color: black; background: rgba(255, 0, 0, 0.2); padding: 3px 0; font-weight: bold">${requestScope.err_log}</p>
                                </c:if>
                                <c:if test="${requestScope.err_reg != null}">
                                    <p style="color: black; background: rgba(255, 0, 0, 0.2); padding: 3px 0; font-weight: bold">${requestScope.err_reg}</p>
                                </c:if>
                            </div>
                            <form id="LoginForm" style="text-align: left;" action="login" method="post" class="login-form">
                                EMAIL
                                <input type="email" name="email" placeholder="name@email.com" required value="${cookie.email.value}">
                                PASSWORD
                                <input type="password" name="pass" placeholder="Enter your password" required value="${cookie.pass.value}">
                                <div class="rememberCB d-flex align-items-center">
                                    <input type="checkbox" ${(cookie.rem.value eq 'on')?"checked":""} name="rem" value="on" style="width: 5%; float: left;">
                                    <span style="width: 50%;">Remember me</span>
                                </div>
                                <div style="clear: both;"></div>
                                <a href="forgotpass">Forgot password?</a>
                                <input type="submit" value="Login">
                                <!-- <button style="width: 100%;height: 50px;margin-top: 10px;"><i class="fa-brands fa-google"></i>Continue with Google</button> -->
                                <!--<input type="button" value="Continue with Google">-->
                            </form>
                            <form id="RegForm" style="text-align: left;" action="register" method="post">
                                FULL NAME
                                <input type="text" name="fname" placeholder="Enter your full name" required>
                                EMAIL
                                <input type="email" name="email" placeholder="name@email.com" required>
                                PASSWORD
                                <input type="password" name="pass" placeholder="Enter your password" required>
                                <input type="submit" value="Register">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
    <c:if test="${requestScope.path == null}">
        <script type="text/javascript">
            <%@include file="../js/account_login.js"%>
        </script>
    </c:if>
    <c:if test="${requestScope.path eq '/login'}">
        <script type="text/javascript">
            <%@include file="../js/account_login.js"%>
        </script>
    </c:if>
    <c:if test="${requestScope.path eq '/register'}">
        <script type="text/javascript">
            <%@include file="../js/account_register.js"%>
        </script>
    </c:if>
</html>

