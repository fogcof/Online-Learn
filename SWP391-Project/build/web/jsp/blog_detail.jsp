
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Blog detail</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
              integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />

        <style>
            .navbar {
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            }
        </style>
    </head>

    <body>
        <jsp:include page="header.jsp"/>

        <nav class="body row d-flex justify-content-center">

            <nav class="navbar navbar-expand-lg navbar-light w-75" style="margin-top: 120px;">
                <a class="navbar-brand" href="bloglist" style=" display: flex;">
                    <h4 class="text-dark">Coursere </h4>
                    <h4 class="ml-1 font-weight-bold text-dark">Blog</h4>
                </a>
                <button class="navbar-toggler " type="button" data-toggle="collapse" data-target="#navbarSupportedContent2"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent2">
                <form action="bloglist" method="get" class="form-inline my-2 my-lg-8 ml-auto">
                    <input name="searchBlog" class="form-control mr-sm-2" type="search" placeholder="Search in Blog" aria-label="Search" style="width: 350px;">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
                </div>
            </nav>

            <div class="body col-9 ">



                <c:set var="bld" value="${requestScope.blogdetail}" />

                <div class="body_head row my-5">
                    <div class="body_head_left col-8 p-3 mb-2 bg-info text-dark">
                        <h4>${bld.potitle}</h4>
                        <h7>${bld.podate}</h7>
                    </div>
                    <div class="body_head_right col-4 d-flex align-items-end  ">
                        <div class="d-flex align-items-start flex-column w-100">
                            <h7 class="font-weight-bold ml-4">KEPP READING</h7>

                            <hr class="mt-0" style=" width: 100%; " >
                        </div>
                    </div>
                </div>

                <div class="body_content row">
                    <div class="body_conttent_img col-8">
                        <img src="${bld.poimg}"
                             class="w-100">
                    </div>

                    <div class="body_content_postrelate col-4 ">
                        <c:forEach items="${requestScope.listRelate}" var="bl2" >
                            <div class="mt-3 ml-4">
                                <a href="blogdetail?id=${bl2.poid}" style="text-decoration: none;">
                                    ${bl2.potitle}
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                </div>

                <div class="body_content_desc mt-5 col-8 p-0">
                    ${bld.podesc}
                </div>



            </div>


        </nav>

        <jsp:include page="footer.jsp"/>


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