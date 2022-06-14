<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>User Profile</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
        integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
  </head>
  <body >
    <!-- header --> 
    <jsp:include page="header.jsp"></jsp:include>

    <!-- body -->
    <section  style="margin: 13vh 3.5vw 0 3.5vw; padding: 0 0 5vh 0; background-color: rgb(219, 234, 246); ">
      <!-- title -->
      <div class="d-flex justify-content-between">
        <div class="d-flex align-items-center" style="margin: 1vw 0 0 2vw;">
            <div class="d-flex flex-column">
                <c:if test="${requestScope.edit == null}">
                    <h1>My profile</h1>
                </c:if>    
                <c:if test="${requestScope.edit != null}">
                    <h1>Edit my profile</h1>
                </c:if>   
                    <p>Let the Coursere community of other learners and instructors recognize you.</p>
                    <p>Introduce yourself to the Coursere community. Connect with learners like you to grow your network.</p>
            </div>
            
        </div>
        <c:if test="${requestScope.edit == null}">
            <div class="d-flex align-items-center" style="margin: 1vw 3vw 3vw 0;">      
                <form action="userprofile" method="post">
                    <input class="btn btn-primary" type="submit" value="Edit" style="width: 150px; height: 60px;">
                </form>
            </div>
        </c:if>
        <c:if test="${requestScope.edit != null}">
            <div class="d-flex align-items-center" style="margin: 1vw 3vw 3vw 0;">
                <form action="userprofile" ${requestScope.edit == null ? "hidden" : ""}>
                    <input class="btn btn-primary" style="width: 150px; height: 60px;" type="submit" value="Cancel">
                </form>
            </div> 
        </c:if>
      </div>
      <hr style="margin: 0 5vw 2vw 5vw"/>
      <!-- Intro -->
      <div>
          <form ${requestScope.edit == null ? "hidden" : ""} class="d-flex justify-content-center" action="changeimg" method="post">
                <div class="d-flex flex-column" style="margin: 0 30px 0 0;">
                    <div class="d-flex justify-content-end">
                      <p style="font-weight: bold;">Full Name</p>
                    </div>
                    <div class="d-flex justify-content-end" style="margin: 30px 0 100px 0;">
                      <p style="font-weight: bold;">Profile Photo</p>
                    </div>
                    <div class="d-flex justify-content-end">
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

            <div class="d-flex flex-column">
                <c:if test="${sessionScope.user != null}">
                    <input name="uName" id="uName" value="${sessionScope.user.ufullname}" <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;">
                </c:if>

                <!--Img-->
                <div class="d-flex justify-content-start" style="margin: 30px 0 0 0;">
                    <c:if test="${sessionScope.user.uimg != null}">
                        <c:if test="${sessionScope.newImg != null}">
                            <img class="img-thumbnail" style="width: 100px; height: 100px;" src="${sessionScope.newImg}" alt="Image">
                        </c:if>
                        <c:if test="${sessionScope.newImg == null}">
                            <img class="img-thumbnail" style="width: 100px; height: 100px;" src="${sessionScope.user.uimg}" alt="Image">
                        </c:if>
                    </c:if>
                    <c:if test="${sessionScope.user.uimg == null}">
                        <img style="width: 100px; height: 100px;border: 3px solid black;" src="https://thumbs.dreamstime.com/b/pack-cs-225697275.jpg" alt="Image">
                    </c:if>
                    <c:if test="${requestScope.edit != null}">
                        <div style="margin: 0 0 0 30px;">
                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                              Choose image
                            </button>
                            <!-- pop up -->
                            <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                              <div class="modal-dialog modal-dialog-centered" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle">Image</h5>
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    </div>
                                    <div class="modal-body">
                                            <div>
                                                <div class="d-flex justify-content-around" style="margin: 0 0 10px 0">
                                                    <div>
                                                        <!--man 1--> 
                                                        <input type="radio" id="uImg1" 
                                                               onclick="window.location.href='changeimg?uImage=' + uImg1.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/01/c7/51/01c751482ef7c4f5e93f3539efd27f6f.jpg"
                                                        >
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/01/c7/51/01c751482ef7c4f5e93f3539efd27f6f.jpg" alt="Image">
                                                    </div>  
                                                    <div>
                                                        <!--man 2-->
                                                        <input type="radio" id="uImg2" 
                                                               onclick="window.location.href='changeimg?uImage=' + uImg2.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/d0/76/ca/d076ca88a7f03922a521a0c40391a06b.jpg">
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/d0/76/ca/d076ca88a7f03922a521a0c40391a06b.jpg" alt="Image">
                                                    </div>  
                                                    <div>
                                                        <!--woman 1-->
                                                        <input type="radio" id="uImg3" 
                                                               onclick="window.location.href='changeimg?uImage=' + uImg3.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/cb/07/d0/cb07d02ccf6d3cea96762f3bbefd5fe5.jpg">
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/cb/07/d0/cb07d02ccf6d3cea96762f3bbefd5fe5.jpg" alt="Image">
                                                    </div>  
                                                </div>
                                                <div class="d-flex justify-content-around">
                                                    <div>
                                                        <!--woman 2-->
                                                        <input type="radio" id="uImg4" 
                                                               onclick="window.location.href='changeimg?uImage=' + uImg4.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/a1/29/16/a12916ebc51a8544d15f0175ea084e6a.jpg">
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/a1/29/16/a12916ebc51a8544d15f0175ea084e6a.jpg" alt="Image">
                                                    </div>
                                                    <div>
                                                        <!--lgbt-->
                                                        <input type="radio" id="uImg5"
                                                               onclick="window.location.href='changeimg?uImage=' + uImg5.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/0d/ab/e8/0dabe8c0c51860190bafc0b3b33805ab.jpg">
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/0d/ab/e8/0dabe8c0c51860190bafc0b3b33805ab.jpg" alt="Image">
                                                    </div>
                                                    <div>
                                                        <!--cat-->
                                                        <input type="radio" id="uImg6" 
                                                               onclick="window.location.href='changeimg?uImage=' + uImg6.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/47/fd/e0/47fde09d34630a06690d16de05468d15.jpg">
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/47/fd/e0/47fde09d34630a06690d16de05468d15.jpg" alt="Image">
                                                    </div>
                                                    <div>
                                                        <!--dog-->
                                                        <input type="radio" id="uImg7" 
                                                               onclick="window.location.href='changeimg?uImage=' + uImg7.value + '&uName=' +uName.value + 
                                                                         '&uEmail='+ uEmail.value + '&uPhone=' + uPhone.value + '&uDob=' + uDob.value 
                                                                       + '&genId=' + genId.value + '&uAddress=' + uAddress.value + '&uWallet=' + uWallet.value"
                                                               name="uImage" value="https://i.pinimg.com/564x/b2/0a/e9/b20ae9f4316faaf04ec9df36bbed7370.jpg">
                                                        <img style="width: 80px; height: 80px;" src="https://i.pinimg.com/564x/b2/0a/e9/b20ae9f4316faaf04ec9df36bbed7370.jpg" alt="Image"></div>
                                                </div>
                                            </div>
                                          <hr>
                                  </div>
                                </div>
                              </div>
                            </div>
                        </div>
                    </c:if>
                    </div>
                <!--end Img-->
                    <div style="margin: 30px 0 0 0;">
                        <c:if test="${sessionScope.user != null}">
                            <input name="uEmail" type="text" id="uEmail" style="width: 400px;height: 40px;" readonly value="${sessionScope.user.uemail}">
                        </c:if>
                    </div>
                    <div style="margin: 30px 0 0 0;"> 
                        <c:if test="${sessionScope.user.uphone != null}">
                            <input name="uPhone" type="text" id="uPhone" pattern="[0-9]{10,11}" title="Wrong format.Enter your phone." value="${sessionScope.user.uphone}" <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;">
                        </c:if>
                        <c:if test="${sessionScope.user.uphone == null}">
                            <input name="uPhone" type="text" placeholder="0123456789" pattern="[0-9]{10,11}" title="Wrong format.Enter your phone." id="uPhone" <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;">
                        </c:if>
                    </div>
                    <div style="margin: 30px 0 0 0;">
                        <c:if test="${sessionScope.user.udob != null}">
                            <input name="uDob" type="date" value="${sessionScope.user.udob}" pattern="(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])-\d{4}" id="uDob" <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;">
                        </c:if>
                        <c:if test="${sessionScope.user.udob == null}">
                            <input name="uDob" type="date" placeholder="dd-mm-yyyy" id="uDob" pattern="(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])-\d{4}" <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;"> 
                        </c:if>
                    </div>

                    <div class="d-flex align-items-center" style="margin: 30px 0 0 0; width: 400px;height: 40px;">
                        <input <c:if test="${requestScope.edit == null}">onclick="return false;"</c:if>  name="genId" id="genId" <c:if test="${sessionScope.user.gid == 1}">checked</c:if> value="1" style="margin: 0 0.5vw 0 2vw;" type="radio">Male
                        <input <c:if test="${requestScope.edit == null}">onclick="return false;"</c:if>  name="genId" id="genId" <c:if test="${sessionScope.user.gid == 2}">checked</c:if>  value="2" style="margin: 0 0.5vw 0 2vw;;" type="radio">Female
                        <input <c:if test="${requestScope.edit == null}">onclick="return false;"</c:if>  name="genId" id="genId" <c:if test="${sessionScope.user.gid == 3}">checked</c:if> value="3" style="margin: 0 0.5vw 0 2vw;" type="radio">Other
                        <input <c:if test="${requestScope.edit == null}">onclick="return false;"</c:if>  name="genId" id="genId" <c:if test="${sessionScope.user.gid == 4}">checked</c:if> value="4" style="margin: 0 0.5vw 0 2vw;" type="radio">I'd rather not say                                                    
                    </div>

                    <div style="margin: 30px 0 0 0;">
                        <c:if test="${sessionScope.user.uaddress != null}">
                            <input name="uAddress" type="text" id="uAddress" style="width: 400px;height: 40px;" <c:if test="${requestScope.edit == null}"> readonly</c:if> value="${sessionScope.user.uaddress}">
                        </c:if>
                        <c:if test="${sessionScope.user.uaddress == null}">
                            <input name="uAddress" type="text" id="uAddress" style="width: 400px;height: 40px;" <c:if test="${requestScope.edit == null}"> readonly</c:if> placeholder="Your Address">
                        </c:if>
                    </div>
                    <div style="margin: 30px 0 0 0;">
                        <c:if test="${sessionScope.user.uwallet != null}">
                            <input name="uWallet" type="text" id="uWallet" value="${sessionScope.user.uwallet}" <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;" >
                        </c:if>
                        <c:if test="${sessionScope.user.uwallet == null}">
                            <input name="uWallet" type="text" id="uWallet" placeholder="..." <c:if test="${requestScope.edit == null}"> readonly</c:if> style="width: 400px;height: 40px;" >
                        </c:if>    
                    </div>
                    <c:if test="${requestScope.edit != null}">
                        <input class="btn btn-primary" style="width: 150px; height: 60px;margin: 1vw 3vw 0 3vw;" type="submit" value="Save change">
                    </c:if>
                </div>
                </form>      
            </div>
        </div>
                   
    </section>
    
    <jsp:include page="footer.jsp"></jsp:include>
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
</html>
