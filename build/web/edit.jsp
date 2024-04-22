 <%-- 
    Document   : edit
    Created on : Nov 2, 2023, 2:17:37 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="cssOfManager.jsp"></jsp:include>
        </head>
        <body>
            <div class="container-xl">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                <div class="col-sm-6">
                                    <h2>Manage <b>Products</b></h2>
                                </div>
                                <div class="col-sm-6">
                                    <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Products</span></a>
                                    <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                                </div>
                            </div>
                        </div>
                        <div id="addEmployeeModal" >
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="edit2" method="post">
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Edit Product</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">
                                            <div class="form-group">
                                                <label>Id</label>
                                                <input type="text" name="id" readonly value="${list.id}"  class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Price</label>
                                                <input type="text" name="price" value="${list.price}"  class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Name</label>
                                                <input  type="text" name="name" value="${list.name}" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Quantity</label>
                                                <input  type="text" name="quantity" value="${list.quantity}" class="form-control" required>
                                            </div>	
                                            <div class="form-group">
                                                <label>Brand</label>
                                                <input  type="text" name="brand" value="${list.brand}" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Image</label>
                                                <input  type="text" name="image" value="${list.image}" class="form-control" required>
                                            </div>

                                            <div class="form-group">
                                                <label>Category</label>
                                                <select name="category">
                                                    <c:forEach items="${requestScope.listC}" var="c">
                                                    <option value="${c.id}">${c.name}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="modal-footer">
                                        <a href="manager.jsp" style="border: 1px solid black; padding: 2px; border-radius: 1px" > <span style="color: black; border: 2px;">Cancel</span></a>
                                        <input  type="submit" value="Edit">
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>        
        </div>
    </body>
</html>
