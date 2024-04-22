<%-- 
    Document   : header
    Created on : Oct 30, 2023, 5:04:06 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header>
    <!-- header inner -->
    <div class="head_top">
        <div class="header">

            <div class="container-fluid">

                <div class="row">
                    <div class="col-lg-3 logo_section">
                        <div class="full">
                            <div class="center-desk">
                                <div class="logo">
                                    <a href="index.html"><img src="images/logo.png" alt="#"></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-lg-9">
                        <div class="right_header_info">
                            <ul>
                                <li class="menu_iconb">
                                    <a href="#"><img style="margin-right: 15px;" src="icon/1.png" alt="#" />0328424790</a>
                                </li>
                                <li class="menu_iconb">
                                    <a href="login.jsp">Log in <img style="margin-right: 15px;" src="icon/5.png" alt="#" /> ${name} </a>
                                </li>
                                <li class="tytyu">
                                    <a href="#">Cart <img style="margin-right: 15px;" src="icon/2.png" alt="#" /></a>
                                </li>
                                <li>
                                    <button type="button" id="sidebarCollapse">
                                        <img src="images/menu_icon.png" alt="#" />
                                    </button>
                                </li>
                                <!--search-->
                                <li class="menu_iconb">
                                    <form action="search" method="post" class="form-inline my-2 my-lg-0" style=" padding-left: 20px;">
                                        <div class="input-group input-group-sm">
                                            <input value="${txtS}" name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                                            <div class="input-group-append">
                                                <button type="submit" class="btn btn-secondary btn-number">
                                                    <i class="fa fa-search"></i>
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- end header inner -->

        <!-- end header -->
        <section class="slider_section">
            <div class="banner_main">
                <div class="container-fluid padding3">
                    <div class="row">
                        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12 mapimg">
                            <div class="text-bg">
                                <h1>All <br>
                                    In<br>
                                    One <br>
                                    Shop</h1>
                                <span> customers can find a wide range of items or services all conveniently located under one roof, 
                                    while "Logan" adds a personalized and memorable touch to the brand.</span>
                            </div>
                        </div>
                        <div class="col-xl-8 col-lg-8 col-md-8 col-sm-12">
                            <div id="myCarousel" class="carousel slide banner_Client" data-ride="carousel">
                                <ol class="carousel-indicators">
                                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                    <li data-target="#myCarousel" data-slide-to="1"></li>
                                    <li data-target="#myCarousel" data-slide-to="2"></li>
                                </ol>
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <div class="container">
                                            <div class="carousel-caption text">
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="img_bg">
                                                            <figure><img src="images/clothing.png" /></figure>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <div class="container">
                                            <div class="carousel-caption text">
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="img_bg" >
                                                            <figure ><img src="icon/green.png" "/></figure>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <div class="container">
                                            <div class="carousel-caption text">
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="img_bg">
                                                            <figure><img src="icon/giay.png" /></figure>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

    </div>
</header>
