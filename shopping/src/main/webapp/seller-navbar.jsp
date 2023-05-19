<%@page import="model.seller"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    seller s = null;
    if(session.getAttribute("data")!=null){
    	s = (seller)session.getAttribute("data");
    }
    else{
    	response.sendRedirect("seller-login.jsp");
    }
    %>
 <!-- Navbar Start -->
    <div class="container-fluid bg-dark mb-30">
        <div class="row px-xl-5">
            <div class="col-lg-9">
                <nav class="navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0">
                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav mr-auto py-0">
                            <a href="seller-home.jsp" class="nav-item nav-link active">Home</a>
                            <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Product <i class="fa fa-angle-down mt-1"></i></a>
                                <div class="dropdown-menu bg-primary rounded-0 border-0 m-0">
                                    <a href="seller-upload-product.jsp" class="dropdown-item">Upload Product</a>
                                    <a href="seller-manage-product.jsp" class="dropdown-item">Manage Product</a>
                                </div>
                            </div>
                             <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown"><%=s.getName() %> <i class="fa fa-angle-down mt-1"></i></a>
                                <div class="dropdown-menu bg-primary rounded-0 border-0 m-0">
                                    <a href="seller-profile.jsp" class="dropdown-item">Profile</a>
                                    <a href="seller-change-password.jsp" class="dropdown-item">Change Password</a>
                                    <a href="seller-logout.jsp" class="dropdown-item">Logout</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </div>
    <!-- Navbar End -->

</body>
</html>