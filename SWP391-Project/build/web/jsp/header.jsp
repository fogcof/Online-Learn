<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Header</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
              integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <style type="text/css">
            <%@include file="../css/header.css"%>
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-white py-3 fixed-top" w3-include-html="header.jsp">
            <a class="navbar-brand" href="home">COURSERE</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <form class="form-inline my-2 my-lg-0 ml-5" method="get" action="courselist">
                    <input class="form-control mr-sm-2" type="search" name="search" value="${search}" placeholder="What do you want" aria-label="Search">
                    <button class="btn btn-outline-primary my-2 my-sm-0" type="submit"><i
                            class="fa-solid fa-magnifying-glass"></i> </button>
                </form>
                <ul class="navbar-nav ml-auto">
                    <c:forEach items="${listBlog}" var="lb">
                        <li class="nav-item mr-2 ">
                            <a style="margin: 3px 0 0 0" class="nav-link" href="bloglist?bid=${lb.bid}">${lb.bname}</a>
                        </li>
                    </c:forEach>
                    <c:if test="${sessionScope.user == null}">
                        <li class="nav-item ml-5 mr-4">
                            <a class="nav-link" style="border: 1px solid black;" href="login" >ACCOUNT</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.user != null}">   
                        <li class="nav-item dropdown">
                            <a
                                class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                aria-expanded="false"
                                >
                                <img src="images/avatar/${sessionScope.user.uimg}" style="background-color: #3BAFDA; width: 37px; border-radius: 50%;">
                                <span class="pl-1">${sessionScope.user.ufullname}</span>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#" title="My Course">My Course</a>
                                <a class="dropdown-item" data-toggle="modal" data-target=".bd-example-modal-lg" title="Profile">Profile</a>
                                <a class="dropdown-item" href="#" title="Settings">Settings</a>
                                <a class="dropdown-item" href="#" title="Help Center">Help Center</a>
                                <div class="dropdown-divider"></div> 
                                <a class="dropdown-item" href="changepassword" title="Change Password">Change Password</a>
                                <a class="dropdown-item" href="logout" title="Logout">Logout</a>
                            </div>
                        </li>
                    </c:if> 
                </ul>
            </div>
        </nav>


        <!--user_profile-->
        <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content" style="border-radius: 5%;">
                    <form action="userprofile" enctype="multipart/form-data" method="post">
                        
                        <div class="d-flex justify-content-between align-items-start" style="margin: 15px; height: 100px">
                            <h1>Profile</h1>
                            <!--img user-->
                            <div>
                                <img id="img" src="images/avatar/${sessionScope.user.uimg}" alt="avatar user" style="height: 100px; width: 100px; border-radius: 50%;">
                                <input type="file" name="uImg" accept="image/jpeg, image/png, image/jpg" style="height: 30px; width: 98px">
                            </div>
                            <div style="margin: 0 5px 0 0">
                                <button class="btn btn-secondary" data-dismiss="modal">
                                    <span>Close</span>
                                </button>
                            </div>
                        </div>

                        <div class="d-flex justify-content-center">
                            <div class="d-flex justify-content-center">

                                <!--label input-->
                                <div class="d-flex flex-column" style="margin: 0 30px 0 0;">
                                    <div class="d-flex justify-content-end" style="margin: 7px 0 0 0;">
                                        <p style="font-weight: bold;">Full Name</p>
                                    </div>
                                    <div class="d-flex justify-content-end" style="margin: 30px 0 0 0;">
                                        <p style="font-weight: bold;">Email</p>
                                    </div>
                                    <div class="d-flex justify-content-end" style="margin: 30px 0 0 0;">
                                        <p style="font-weight: bold;">Phone Number</p>
                                    </div>
                                    <div class="d-flex justify-content-end" style="margin: 30px 0 0 0;">
                                        <p style="font-weight: bold;">Birthday</p>
                                    </div>
                                    <div class="d-flex justify-content-end" style="margin: 30px 0 0 0;">
                                        <p style="font-weight: bold;">Gender</p>
                                    </div>
                                    <div class="d-flex justify-content-end" style="margin: 30px 0 0 0;">
                                        <p style="font-weight: bold;">Address</p>
                                    </div>
                                    <div class="d-flex justify-content-end" style="margin: 30px 0 0 0;">
                                        <p style="font-weight: bold;">Wallet</p>
                                    </div>              
                                </div>
                            </div>

                            <div class="d-flex flex-column">
                                <!--input Name-->
                                <input name="uName" value="${requestScope.userEdit.ufullname != null ? requestScope.userEdit.ufullname : sessionScope.user.ufullname}" style="width: 400px;height: 40px;">  
                                <!--input Email-->
                                <div style="margin: 5px 0 0 0">
                                    <p style="font-style: italic; font-size: smaller;margin: 3px 0 0 0; color: #3333ff">You cannot edit your email.</p>
                                    <input name="uEmail" type="text" style="width: 400px;height: 40px;" readonly value="${sessionScope.user.uemail}">
                                </div>

                                <!--input Phone-->    
                                <div style="margin: 30px 0 0 0;"> 
                                    <c:if test="${sessionScope.user.uphone != null}">
                                        <input name="uPhone" type="text" pattern="[0-9]{10,11}" title="Wrong format.Enter your phone." value="${requestScope.userEdit.uphone != null ? requestScope.userEdit.uphone : sessionScope.user.uphone}"  style="width: 400px;height: 40px;">
                                    </c:if>
                                    <c:if test="${sessionScope.user.uphone == null}">
                                        <input name="uPhone" type="text" placeholder="0123456789" pattern="[0-9]{10,11}" title="Wrong format.Enter your phone." value="${requestScope.userEdit.uphone != null ? requestScope.userEdit.uphone : ""}" style="width: 400px;height: 40px;">
                                    </c:if>
                                </div>

                                <!--input Dob-->
                                <div style="margin: 30px 0 0 0;">
                                    <c:if test="${sessionScope.user.udob != null}">
                                        <input name="uDob" type="date" value="${requestScope.userEdit.udob != null ? requestScope.userEdit.udob : sessionScope.user.udob}" pattern="(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])-\d{4}" style="width: 400px;height: 40px;">
                                    </c:if>
                                    <c:if test="${sessionScope.user.udob == null}">
                                        <input name="uDob" type="date" value="${requestScope.userEdit.udob != null ? requestScope.userEdit.udob : ""}"  placeholder="dd-mm-yyyy" id="uDob" pattern="(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])-\d{4}" style="width: 400px;height: 40px;"> 
                                    </c:if>
                                </div>

                                <!--input Gender-->
                                <div class="d-flex align-items-center" style="margin: 30px 0 0 0; width: 400px;height: 40px;">
                                    <input  name="genId" <c:if test="${(requestScope.userEdit.gid != null ? requestScope.userEdit.gid : sessionScope.user.gid) == 1}">checked</c:if> value="1" style="margin: 0 0.5vw 0 2vw;" type="radio">Male
                                    <input  name="genId" <c:if test="${(requestScope.userEdit.gid != null ? requestScope.userEdit.gid : sessionScope.user.gid) == 2}">checked</c:if>  value="2" style="margin: 0 0.5vw 0 2vw;;" type="radio">Female
                                    <input  name="genId" <c:if test="${(requestScope.userEdit.gid != null ? requestScope.userEdit.gid : sessionScope.user.gid) == 3}">checked</c:if> value="3" style="margin: 0 0.5vw 0 2vw;" type="radio">Other
                                    <input  name="genId" <c:if test="${(requestScope.userEdit.gid != null ? requestScope.userEdit.gid : sessionScope.user.gid) == 4}">checked</c:if> value="4" style="margin: 0 0.5vw 0 2vw;" type="radio">I'd rather not say                                                    
                                    </div>

                                    <!--input Address-->
                                    <div style="margin: 30px 0 0 0;">
                                    <c:if test="${sessionScope.user.uaddress != null}">
                                        <input name="uAddress" type="text" style="width: 400px;height: 40px;" value="${requestScope.userEdit.uaddress != null ? requestScope.userEdit.uaddress :sessionScope.user.uaddress}">
                                    </c:if>
                                    <c:if test="${sessionScope.user.uaddress == null}">
                                        <input name="uAddress" type="text" style="width: 400px;height: 40px;"  placeholder="Your Address" value="${requestScope.userEdit.uaddress != null ? requestScope.userEdit.uaddress :""}" >
                                    </c:if>
                                </div>

                                <!--input Wallet-->
                                <div style="margin: 30px 0 0 0;">
                                    <c:if test="${sessionScope.user.uwallet != null}">
                                        <input name="uWallet" type="text" value="${requestScope.userEdit.uwallet != null ? requestScope.userEdit.uwallet : sessionScope.user.uwallet}" style="width: 400px;height: 40px;" >
                                    </c:if>
                                    <c:if test="${sessionScope.user.uwallet == null}">
                                        <input name="uWallet" type="text" placeholder="..." style="width: 400px;height: 40px;" value="${requestScope.userEdit.uwallet != null ? requestScope.userEdit.uwallet :""}">
                                    </c:if>    
                                </div>

                                <div style="margin:10px">
                                    <input class="btn btn-primary" style="width: 150px; height: 60px;margin: 1vw 3vw 0 3vw;" type="submit" value="Save change">
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </body>
    <script type="text/javascript">
        window.addEventListener('load', function () {
            document.querySelector('input[type="file"]').addEventListener('change', function () {
                if (this.files && this.files[0]) {
                    var img = document.querySelector('#img');
                    img.onload = () => {
                        URL.revokeObjectURL(img.src);  // no longer needed, free memory
                    };
                    img.src = URL.createObjectURL(this.files[0]); // set src to blob url
                }
            });
        });
        
        
        
    </script>  
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
</html>

