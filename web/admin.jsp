<%-- 
    Document   : UserManager
    Created on : Nov 1, 2023, 4:02:24 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="cssOfManager.jsp"></jsp:include>
        </head>
        <body>
            <div class="container-xl">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                <div class="col-sm-6">
                                    <h2>Admin <b>Account</b></h2>
                                </div>
                                <div class="col-sm-6">
                                    <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Account</span></a>						
                                </div>
                            </div>
                        </div>
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>
                                        <span class="custom-checkbox">
                                            <input type="checkbox" id="selectAll">
                                            <label for="selectAll"></label>
                                        </span>
                                    </th>
                                    <th>ID</th>
                                    <th>User</th>
                                    <th>Password</th>
                                    <th>isSell</th>
                                    <th>isAdmin</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${requestScope.list}" var="c">
                                <tr>
                                    <td>${c.id}</td>
                                    <td>${c.user}</td>
                                    <td>${c.password}</td>
                                    <td>${c.isSell}</td>
                                    <td>${c.isAdmin}</td>
                                    <td>
                                        <a href="edita?id=${c.id}" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                        <a href="deleta?id=${c.id}" ><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>	
                        </tbody>
                    </table>
                </div>
            </div>        
        </div>

        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="adda" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add New Account</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>User</label>
                                <input type="text" name="user"   class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input  type="text" name="password"  class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>isSell</label>
                                <input  type="text" name="isSell"  class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>isAdmin</label>
                                <input  type="text" name="isAdmin"  class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button"  value="Cancel">
                            <input type="submit" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>


        <!-- Delete Modal HTML -->
        <div id="deleteEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Delete Employee</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <p>Are you sure you want to delete these Records?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-danger" value="Delete">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>