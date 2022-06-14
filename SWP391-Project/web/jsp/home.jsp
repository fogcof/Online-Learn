<%-- 
    Document   : home
    Created on : May 28, 2022, 6:34:46 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
              integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <style type="text/css">
            <%@include file="../css/home.css"%>
        </style>

    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <c:if test="${sessionScope.user == null}">
            <section>
                <div class="container-fluid d-flex justify-content-around align-items-center banner" style="margin: 110px 0 80px 0">
                    <div class="row">
                        <div class="col-xs-12 col-md-8 mt-3 pt-5 my_div">
                            <h1 class="ban_text">Learn without limits</h1>
                            <p class="my_text">
                                Start, switch, or advance your career with many courses from
                                out platform.
                            </p>
                            <button class="my_button">
                                <a style="color: white;" href="register">Join in Free</a>
                            </button>
                            <button class="my_button" style="background-color: #ffffff;">
                                <a style="color: #0056d2;" href="courselist">Try all Courses</a>
                            </button>
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <img class="ban_img" src="http://surl.li/cbsof" alt="..." />
                        </div>
                    </div>
                </div>
                <div class="d-flex flex-column justify-content-center align-items-center mb-5 advertise">
                    <div class="my_text" style="font-size: 30px; color: #0062E4">
                        Discovering our courses you can learn many things
                    </div>
                    <div
                        id="carouselExampleIndicators"
                        class="container-fluid carousel slide col-md-9"
                        data-ride="carousel"
                        >
                        <ol class="carousel-indicators">
                            <li
                                data-target="#carouselExampleIndicators"
                                data-slide-to="0"
                                class="active "
                                ></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <a href="courselist?subject=1&subject=6">
                                    <img class="d-block w-100"src="http://surl.li/cduuh" style="max-width: 100%" alt="..."/>
                                    <div class="carousel-caption" style="background-color: beige">
                                        <h5 style="color: #373A3C">Join with us to open your knowledge about the science in the world...</h5>
                                        <p style="color: #373A3C">Welcome to our journey and good luck to you!</p>
                                    </div>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="courselist?subject=4">
                                    <img class="d-block w-100"  src="http://surl.li/cduva" style="max-width: 100%" alt="..." />
                                    <div class="carousel-caption d-none d-md-block" style="background-color: #373A3C">
                                        <h5 style="color: #EBF3FF">Just to be the best version of yourself to adapt the chance of the world...</h5>
                                        <p style="color: #EBF3FF">Welcome to our journey and good luck to you!</p>
                                    </div>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="courselist?subject=2">
                                    <img class="d-block w-100" src="http://surl.li/cduuf" style="max-width: 100%" alt="..."/>
                                    <div class="carousel-caption d-none d-md-block" style="background-color: beige">
                                        <h5 style="color: #373A3C">Join with us to experience new knowledge about the mathematic in the world...</h5>
                                        <p style="color: #373A3C">Welcome to our journey and good luck to you!</p>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <a
                            class="carousel-control-prev pre"
                            href="#carouselExampleIndicators"
                            role="button"
                            data-slide="prev"
                            >
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">&#10094;</span>
                        </a>
                        <a
                            class="carousel-control-next next"
                            href="#carouselExampleIndicators"
                            role="button"
                            data-slide="next"
                            >
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">&#10095;</span>
                        </a>
                    </div>
                </div>
            </section>
        </c:if>
        <c:if test="${sessionScope.user != null}">
            <section>
                <!--                <div class="d-flex justify-content-start align-items-center advertise user_banner">
                                    <h5 class="pl-5">Welcome back ${sessionScope.user.ufullname}!</h5>
                                </div>-->
                <nav class="navbar navbar-expand-lg navbar-light py-3 pl-5 user_banner">
                    <div>
                        <ul class="navbar-nav ml-auto"> 
                            <li class="nav-item mr-2 active">
                                <a class="nav-link a" href="home">Home</a>
                            </li>
                            <li class="nav-item mr-2">
                                <a class="nav-link a" href="#">In Process</a>
                            </li>
                            <li class="nav-item mr-2">
                                <a class="nav-link a" href="#">Completed</a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </section>
        </c:if>
        <section class="row">
            <div class="col-xs-12 col-sm-10 col-md-8">
                <div id="course" class="container-fluid d-flex flex-column justify-content-center align-items-center">
                    <div class="advertise">
                        <div class="my_text" style="color: #382D8B">
                            100% Free Courses (Top ${requestScope.numberFr})
                        </div>
                        <h2>
                            Start Learning with Free Courses
                        </h2>
                        <p>
                            Free courses from top subjects in our platform.
                        </p>
                    </div>
                    <hr class="mt-0" style="width: 100%">
                    <div class="course-content row">
                        <c:forEach items="${requestScope.listFreeCourse}" var="list">
                            <div class="d-flex col-lg-3 col-md-6 col-xs-12 my-3">
                                <div class="course-detail">
                                    <a style="text-decoration: none" href="#">
                                        <img class="img-fluid"
                                             src="${list.cimg}"
                                             alt="image about course">
                                        <div class="course-title">
                                            <c:if test="${list.cprice == 0}">
                                                <span class="my_span">Free</span>
                                            </c:if>
                                            <c:if test="${list.cprice != 0}">
                                                <span class="my_span">${list.cprice} $</span>
                                            </c:if>
                                            <div class="div1">Course name: ${list.cname}</div>
                                            <div class="div2">Course title: ${list.ctitle}</div>
                                            <h6>
                                                <c:forEach items="${listSubject}" var="s">
                                                    <c:if test="${s.sid==list.sid}">Subject: ${s.sname}</c:if>
                                                </c:forEach>
                                            </h6>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="mt-5">
                        <button class="my_button" style="background-color: #ffffff; font-size: 12px;">
                            <a class="my_link" href="courselist">Explore more Courses</a>
                        </button>
                    </div>
                    <div class="advertise">
                        <div class="my_text" style="color: #382D8B">
                            Specializations Courses (Top ${requestScope.numberF})
                        </div>
                        <h2>
                            Start Learning with more Courses 
                        </h2>
                        <p>
                            Courses covering top topics such as business, graphic design, and more.
                        </p>
                    </div>
                    <div class="course-content row">
                        <c:forEach items="${requestScope.listFeeCourse}" var="list">
                            <div class="d-flex col-lg-3 col-md-6 col-xs-12 my-3">
                                <div class="course-detail">
                                    <a style="text-decoration: none" href="#">
                                        <img class="img-fluid"
                                             src="${list.cimg}"
                                             alt="image about course">
                                        <div class="course-title">
                                            <c:if test="${list.cprice == 0}">
                                                <span class="my_span">Free</span>
                                            </c:if>
                                            <c:if test="${list.cprice != 0}">
                                                <span class="my_span">${list.cprice} $</span>
                                            </c:if>
                                            <div class="div1">Course name: ${list.cname}</div>
                                            <div class="div2">Course title: ${list.ctitle}</div>
                                            <h6>
                                                <c:forEach items="${listSubject}" var="s">
                                                    <c:if test="${s.sid==list.sid}">Subject: ${s.sname}</c:if>
                                                </c:forEach>
                                            </h6>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="mt-5">
                        <button class="my_button" style="background-color: #ffffff; font-size: 12px;">
                            <a class="my_link" href="courselist">Explore more Courses</a>
                        </button>
                    </div>
                    <div class="advertise">
                        <div class="my_text" style="color: #382D8B">
                            Free Posts (Top ${requestScope.numberE})
                        </div>
                        <h2>
                            Hot Posts
                        </h2>
                        <p>
                            Posts in top topics such as business, education, and more.
                        </p>
                    </div>
                    <div class="course-content row">
                        <c:forEach items="${requestScope.listEarlyPost}" var="list">
                            <div class="d-flex col-lg-3 col-md-6 col-xs-12 my-3">
                                <a style="text-decoration: none" href="blogdetail?id=${list.poid}">
                                    <div class="course-detail">
                                        <img class="img-fluid" style="max-height: 12vh"
                                             src="${list.poimg}"
                                             alt="image about post">
                                        <div class="course-title">
                                            <div class="div3">Post name: ${list.potitle}</div>
                                            <div class="div2">Post updated: ${list.podate}</div>
                                            <h6>
                                                <c:forEach items="${listBlog}" var="lb">
                                                    <c:if test="${list.bid==lb.bid}">Blog: ${lb.bname}</c:if>
                                                </c:forEach>
                                            </h6>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="mt-5">
                        <button class="my_button" style="background-color: #ffffff; font-size: 12px;">
                            <a class="my_link" href="bloglist">Explore more Posts</a>
                        </button>
                    </div>
                </div>
            </div>
            <div class="col-xs-12 col-sm-2 col-md-4">
                <div class="d-flex flex-column justify-content-center align-items-start mt-4 advertise">
                    <div class="my_text" style="color: #382D8B">
                        Free Posts (Top ${requestScope.numberL})
                    </div>
                    <h2>
                        Lastest Posts
                    </h2>
                    <p>
                        Posts in which is updated lastly.
                    </p>
                    <hr class="mt-0" style="width: 100%">
                    <c:forEach items="${requestScope.listLastestPost}" var="list" >
                        <div class="course-content">
                            <div class="course-title" style="width: 80%">
                                <a href="blogdetail?id=${list.poid}" style="text-decoration: none;">
                                    <img class="img-fluid" src="${list.poimg}" alt="...">
                                    <div class="div1 my-2">${list.potitle}</div>
                                    <div class="div2 mb-0">Post updated: ${list.podate}</div>
                                </a>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>
        <c:if test="${sessionScope.user == null}">
            <section>
                <div class="container-fluid d-flex justify-content-center align-items-center banner mt-5 mb-5">
                    <div class="row">
                        <div class="col-xs-12 col-md-8 pt-5">
                            <h1 class="ban_text" style="font-size: 35px">Take the next step toward your personal and<br/> professional goals with Coursere.</h1>
                            <p class="my_text">
                                Join now to receive personalized recommendations from the full<br/> Coursere catalog.
                            </p>
                            <button class="my_button mt-3">
                                <a style="color: white;" href="register">Join in Free</a>
                            </button>
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <img class="ban_img" src="http://surl.li/cbthb" alt="..." />
                        </div>
                    </div>
                </div>
            </section>
        </c:if>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>
