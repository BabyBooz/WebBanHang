<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.*" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>lion</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" href="css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<!-- body -->

<body class="main-layout">

    <div class="wrapper">
        <!-- end loader -->
        <div class="sidebar">
            <!-- Sidebar  -->
            <nav id="sidebar">

                <div id="dismiss">
                    <i class="fa fa-arrow-left"></i>
                </div>

                <ul class="list-unstyled components">

                    <li class="active">
                        <a href="home">Home</a>
                    </li>
                    <li>
                        <a href="category?id=${"1"}">Clothes</a>
                    </li>  
                    <li>
                        <a href="category?id=${"2"}">Shoes</a>
                    </li>  
                    <li>
                        <a href="category?id=${"3"}">Ring</a>
                    </li> 
                    <c:if test="${sessionScope.acc.getIsSell() == 1}">
                        <li>
                            <a href="manager">Products Manager</a>
                        </li>    
                    </c:if>
                    <c:if test="${sessionScope.acc.getIsAdmin() == 1}">
                        <li>
                            <a href="admin">Products Admin</a>
                        </li>    
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <li>
                            <a href="logout">Log Out</a>
                        </li>
                    </c:if>
                </ul>

            </nav>
        </div>

        <div id="content">
            <!-- header -->
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
                                                <a href="login.jsp">Log in <img style="margin-right: 15px;" src="icon/5.png" alt="#" />${name} </a>
                                            </li>
                                            <li class="tytyu">
                                                <a href="#">Cart <img style="margin-right: 15px;" src="icon/2.png" alt="#" /></a>
                                            </li>

                                            <li>
                                                <button type="button" id="sidebarCollapse">
                                                    <img src="images/menu_icon.png" alt="#" />
                                                </button>
                                            </li>

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
                                            <h1>CART <br>
                                                In<br>
                                                Shop</h1>
                                            <span>This is a products which you choose</span>
                                            <a href="#">Cart</a>
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
                                                                        <figure><img style="padding-left: 350px" src="images/cart.png" /></figure>
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
                                                                        <figure><img style="padding-left: 350px" src="images/cart.png" /></figure>
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
                                                                        <figure><img style="padding-left: 350px" src="images/cart.png" /></figure>
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
            <!-- Categories -->
            <div class="Categories">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="title">
                                <h2> ---Cart---</h2>
                            </div>
                        </div>
                    </div>

                    <!-- Cart -->
                    <div id="brand"  class="brand-bg">
                        <h3>Cart Products</h3>
                        <div class="row">

                            <c:forEach items="${sessionScope.listCart}" var="i">   
                                <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12 margintop">
                                    <div class="brand-box">
                                        <i><img src="${i.getProduct().getImage()}"/>
                                        </i>
                                        <span style="color: grey">-------------------</span>
                                        <h4>${i.getProduct().getName()}</h4>
                                        <span style="color: grey">-------------------</span>
                                        <br/>
                                        <h5> Price $<fmt:formatNumber pattern="##.#" value="${i.getPrice()}"/></h5>
                                        <h5>Total Price $<fmt:formatNumber pattern="##.#" value="${i.getPrice()*i.getQuantity()}"/></h5>
                                    </div>
                                    <input type="text" style="text-align: center; margin-left: 50px" readonly value="${i.getQuantity()}"/>
                                    <a href="deletecart?id=${i.getProduct().getId()}" class="buynow">Remove</a>
                                    <br/>
                                </div>    
                            </c:forEach>

                        </div>

                        <form action="home" method="post">
                            <input type="submit"  value="Return Home"/>   
                        </form>
                        <br/>
                        <br/><br/><br/>


                        <!-- end news brand -->

                        <!-- news shoes -->

                    </div>

                </div>
            </div>
            <!-- end news shoes -->

            <!-- end Categories -->

            <section>
                <!--  save -->

                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="save">
                                <div class="row">
                                    <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                                        <div class="save_box">
                                            <h3>save up to 50%</h3>
                                            <a href="#">Buy now</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- end save -->
            </section>
            <br/>
            <jsp:include page="footer.jsp"></jsp:include>


            </div>
        </div>
        <div class="overlay"></div>

    <jsp:include page="javascript.jsp"></jsp:include>
</body>

</html>