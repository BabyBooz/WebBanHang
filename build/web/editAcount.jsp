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
                                    <h2>Edit <b>Account</b></h2>
                                </div>
                            </div>
                        </div>
                        <div id="addEmployeeModal" >
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="edita2" method="post">
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Edit Account</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">
                                            <div class="form-group">
                                                <label>Id</label>
                                                <input type="text" name="id" readonly value="${a.id}"  class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>User</label>
                                                <input type="text" name="user" value="${a.user}"  class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Password</label>
                                                <input  type="text" name="password" value="${a.password}" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>isSell</label>
                                                <input  type="text" name="isSell" value="${a.isSell}" class="form-control" required>
                                            </div>	
                                            <div class="form-group">
                                                <label>isAdmin</label>
                                                <input  type="text" name="isAdmin" value="${a.isAdmin}" class="form-control" required>
                                            </div>
                                    </div>
                                    <div class="modal-footer">
                                        <a href="admin.jsp" style="border: 1px solid black; padding: 2px; border-radius: 1px" > <span style="color: black; border: 2px;">Cancel</span></a>
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
