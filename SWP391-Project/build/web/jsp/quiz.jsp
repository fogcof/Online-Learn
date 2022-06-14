<%-- 
    Document   : quiz
    Created on : Jun 12, 2022, 10:51:16 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
              integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <style type="text/css">
            <%@include file="../css/quiz.css"%>
        </style>
    </head>

    <body>

        <section id="quiz-title" class="container-fluid mb-3 row mx-auto">
            <div class="quiz-title-detail col-12 py-3">
                <h3>${course.cname} - ${course.cid}</h3>
                <div class="quiz-link">
                    <a href="#" onclick="Finish()">Home</a>
                    <i class="fa-solid fa-angle-right mx-2"></i>
                    <a href="#" onclick="Finish()">My courses</a>
                    <i class="fa-solid fa-angle-right mx-2"></i>
                    <a href="#" onclick="Finish()">${course.cname}</a>
                    <i class="fa-solid fa-angle-right mx-2"></i>
                    <a style="color: #007bff">${quiz.qname}</a>
                </div>
            </div>
        </section>
        <section id="quiz-content" class="container-fluid row mx-auto">
            <div class="quiz-question col-lg-9 col-12">
                <!--                            <table class="generaltable quizreviewsummary">
                                                <tbody>
                                                  <tr>
                                                    <th class="cell" scope="row">Start on</th>
                                                    <td class="cell">Friday, 10 June 2022, 2:20 PM</td>
                                                  </tr>
                                                  <tr>
                                                    <th class="cell" scope="row">State</th>
                                                    <td class="cell">Finished</td>
                                                  </tr>
                                                  <tr>
                                                    <th class="cell" scope="row">Completed on</th>
                                                    <td class="cell">Friday, 10 June 2022, 2:21 PM</td>
                                                  </tr>
                                                  <tr>
                                                    <th class="cell" scope="row">Time taken</th>
                                                    <td class="cell">1 min 16 secs</td>
                                                  </tr>
                                                  <tr>
                                                    <th class="cell" scope="row">Marks</th>
                                                    <td class="cell">0.00/15.00</td>
                                                  </tr>
                                                  <tr>
                                                    <th class="cell" scope="row">Grade</th>
                                                    <td class="cell"><b>0.00</b> out of 10.00 (<b>0</b>%)</td>
                                                  </tr>
                                                </tbody>
                                              </table>-->
                <div class="row quiz-question-detail">
                    <c:forEach items="${fn:split(listans, ',')}" var="ans">
                        <c:if test="${quesid==fn:split(ans, ':')[0]}">
                            <c:set var="preans" value="${fn:split(ans, ':')[1]}"></c:set>
                        </c:if>
                    </c:forEach>
                    <div class="col-2 question-num py-5" style="border-top: 2px solid black;">
                        <h4>Question ${ques.quesid}</h4>
                        <p>${preans!=0?"Answer saved":"Not yet answered"}</p>
                        <p>Marked out of 1.00</p>
                        <p onclick="Flag()"><i class="fa-solid fa-flag"></i> <span id="flag" style="cursor: pointer">
                                <c:set value="0" var="count"/>
                                <c:forEach items="${fn:split(listFlag, '|')}" var="flag">
                                    <c:set value="${count+1}" var="count"/>
                                    <c:if test="${flag=='1'&&count==quesid}">
                                        Remove flag
                                    </c:if>
                                    <c:if test="${flag=='0'&&count==quesid}">
                                        Flag question
                                    </c:if>
                                </c:forEach>
                            </span></p>
                    </div>
                    <div class="col-10 question-wrapper">
                        <c:set var="content" value="${fn:split(ques.qcontent,'|')}"/>
                        <div class="question-content pt-5 pb-5">
                            ${content[0]}
                        </div>
                        <div class="question-answer pt-5">
                            <p>Select one:</p>
                            <input type="radio" ${preans==1?"checked":""} onclick="MyFunction()" name="answer" value="1"> ${content[1]} <br>
                            <input type="radio" ${preans==2?"checked":""} onclick="MyFunction()" name="answer" value="2"> ${content[2]} <br>
                            <input type="radio" ${preans==3?"checked":""} onclick="MyFunction()" name="answer" value="3"> ${content[3]} <br>
                            <input type="radio" ${preans==4?"checked":""} onclick="MyFunction()" name="answer" value="4"> ${content[4]} <br>    
                        </div>
                        <div class="quiz-next d-flex justify-content-between my-5">
                            <button ${quesid==1?"disabled":""} class="btn" id="previous"  style="${quesid==1?"color: gray;":"color: red;"}" onclick="PreNextFunction(this.id)"><i class="fa-solid fa-angle-left mx-2"></i> Previous page</button>
                            <button ${quesid==numques?"disabled":""} class="btn" id="next" style="${quesid==numques?"color: gray;":"color: red;"}" onclick="PreNextFunction(this.id)">Next page <i class="fa-solid fa-angle-right mx-2"></i></button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="quiz-nav col-lg-3 col-12">
                <div class="col-12 quiz-nav-detail py-5" style="border-top: 2px solid blue">
                    <h6>Quiz navigation</h6>
                    <div class="quiz-button d-flex my-4">
                        <c:forEach begin="1" end="${numques}" var="numques">
                            <a class="a" style="
                               <c:set value="0" var="count"/>
                               <c:forEach items="${fn:split(listFlag, '|')}" var="flag">
                                   <c:set value="${count+1}" var="count"/>
                                   <c:if test="${flag=='1'&&count==numques}">
                                       background: url(https://cmshn.fpt.edu.vn/theme/image.php/trema/theme/1597744132/mod/quiz/flag-on) 25px 0px no-repeat;
                                   </c:if>
                               </c:forEach>
                               <c:forEach items="${fn:split(listans, ',')}" var="ans">
                                   <c:if test="${fn:split(ans, ':')[1]!='0'&&fn:split(ans, ':')[0]==numques}">
                                       color: black;background-color: #acc6da;
                                   </c:if>
                               </c:forEach>"
                               href="quiz?cid=${course.cid}&qid=${quiz.qid}&quesid=${numques}&previous=${quesid}&answer=${preans!=0?preans:""}">${numques}</a>
                        </c:forEach>
                    </div>
                    <h6 class="my-4" style="color: red;cursor: pointer" onclick="Finish()">Finish attempt ...</h6>
                    <h6>Time left <span id="time"></span></h6>
                </div>
            </div>
        </section>

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
    <script>
                        function writeCookie(name, value, days) {
                            var date, expires;
                            if (days) {
                                date = new Date();
                                date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
                                expires = "; expires=" + date.toGMTString();
                            } else {
                                expires = "";
                            }
                            document.cookie = name + "=" + value + expires + "; path=/project";
                        }
//                                var sId = '00';
//                                writeCookie('cookieFlag', sId, 1);
                        function readCookie(name) {
                            var i, c, ca, nameEQ = name + "=";
                            ca = document.cookie.split(';');
                            for (i = 0; i < ca.length; i++) {
                                c = ca[i];
                                while (c.charAt(0) == ' ') {
                                    c = c.substring(1, c.length);
                                }
                                if (c.indexOf(nameEQ) == 0) {
                                    return c.substring(nameEQ.length, c.length);
                                }
                            }
                            return '';
                        }

                        function Flag() {
                            var listFlag = readCookie('listFlag');
                            var flags = listFlag.split('|');
                            var newFlags = "";
                            var i;
                            if (document.querySelector('input[name="answer"]:checked') != null) {
                                var a = document.querySelector('input[name="answer"]:checked').value;
                            } else {
                                var a = 0;
                            }
                            if (document.getElementById('flag').innerHTML.trim() == "Flag question") {
                                document.getElementsByClassName('a')[${quesid-1}].style.background = "url(https://cmshn.fpt.edu.vn/theme/image.php/trema/theme/1597744132/mod/quiz/flag-on) 25px 0px no-repeat";
                                document.getElementById('flag').innerHTML = "Remove flag";
                                for (i = 0; i < flags.length; i++) {
                                    if (i ==${quesid-1}) {
                                        newFlags += "1";
                                    } else {
                                        newFlags += flags[i];
                                    }
                                    if (i != flags.length - 1) {
                                        newFlags += "|";
                                    }
                                }
                            } else {
                                document.getElementsByClassName('a')[${quesid-1}].style.background = "";
                                document.getElementById('flag').innerHTML = "Flag question";
                                for (i = 0; i < flags.length; i++) {
                                    if (i ==${quesid-1}) {
                                        newFlags += "0";
                                    } else {
                                        newFlags += flags[i];
                                    }
                                    if (i != flags.length - 1) {
                                        newFlags += "|";
                                    }
                                }
                            }
                            if (a != 0) {
                                document.getElementsByClassName('a')[${quesid-1}].style.backgroundColor = "#acc6da";
                            }
                            writeCookie('listFlag', newFlags, 1);
                        }

                        function MyFunction() {
                            var a = document.querySelector('input[name="answer"]:checked').value;
                            if (a == 1) {
                                NewFunction(a);
                            } else if (a == 2) {
                                NewFunction(a);
                            } else if (a == 3) {
                                NewFunction(a);
                            } else if (a == 4) {
                                NewFunction(a);
                            }
                        }
                        function NewFunction(a) {
                            const collection = document.getElementsByClassName('a');
                            for (let i = 0; i < collection.length; i++) {
                                if (collection[i].href.toString().endsWith("=")) {
                                    collection[i].href += a;
                                } else {
                                    collection[i].href = collection[i].href.toString().substring(0, collection[i].href.length - 1);
                                }
                            }
                        }
                        function PreNextFunction(id) {
                            if (document.querySelector('input[name="answer"]:checked') != null) {
                                var a = document.querySelector('input[name="answer"]:checked').value;
                                if (id == "previous") {
                                    window.location.href = 'quiz?cid=${course.cid}&qid=${quiz.qid}&quesid=${quesid-1}&previous=${quesid}&answer=' + a;
                                } else {
                                    window.location.href = 'quiz?cid=${course.cid}&qid=${quiz.qid}&quesid=${quesid+1}&previous=${quesid}&answer=' + a;
                                }
                            } else {
                                if (id == "previous") {
                                    window.location.href = 'quiz?cid=${course.cid}&qid=${quiz.qid}&quesid=${quesid-1}&previous=${quesid}&answer=';
                                } else {
                                    window.location.href = 'quiz?cid=${course.cid}&qid=${quiz.qid}&quesid=${quesid+1}&previous=${quesid}&answer=';
                                }
                            }
                        }
                        function Finish() {
                            if (confirm("Once you submit, you will no longer be able to change your answers for this attempt.")) {
                                window.location = "finish?qid=${quiz.qid}";
                            }
                        }

    </script>
    <script>
// Set the date we're counting down to

        var countDownDate = ${sessionScope.time};

// Update the count down every 1 second
        var x = setInterval(function () {

            // Get today's date and time
            var now = new Date().getTime();

            // Find the distance between now and the count down date
            var distance = countDownDate - now;

            // Time calculations for days, hours, minutes and seconds
//   var days = Math.floor(distance / (1000 * 60 * 60 * 24));
//   var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
            var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
            var seconds = Math.floor((distance % (1000 * 60)) / 1000);

            // Output the result in an element with id="demo"
            document.getElementById("time").innerHTML = minutes + "m " + seconds + "s ";

            // If the count down is over, write some text 
            if (distance < 0) {
                clearInterval(x);
                document.getElementById("time").innerHTML = "EXPIRED";
                window.location="finish?qid=${quiz.qid}";
            }
        }, 1000);

    </script>
</html>
