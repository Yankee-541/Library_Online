<%-- 
    Document   : header
    Created on : Oct 15, 2021, 3:50:58 PM
    Author     : Tebellum
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
       <div class="hleft">
              <a href='#'><img src='../img/ten_library.png'></a>
       </div>
       <div class="hcenter">
              <nav class="navbar navbar-default">

                     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1 " style="width: 655px;
                          ">
                            <div class="hcenter-child">
                                   <ul class="menu-main nav navbar-nav">
                                          <li class="active"><a href="home"style="padding: 10px 10px;">Home <span class="sr-only"></span></a></li>
                                          <li style="z-index: 2;">
                                                 <a href="category"style="padding: 10px 10px;">
                                                        Thể loại sách<i class="fas fa-sort-down"
                                                                        style="vertical-align: top;padding-left: 5px;"></i>
                                                 </a>
                                                 <div class="sub-menu">
                                                        <ul>
                                                               <c:forEach items="${cates}" var="c">
                                                                      <li>
                                                                             <a href="#">${c.category_name}</a>
                                                                      </li>
                                                               </c:forEach>
                                                        </ul>
                                                 </div>
                                          </li>
                                          <li><a href="review"style="padding: 10px 10px;">Góc review</a></li>
                                          <li><a href="login"style="padding: 10px 10px;">Login</a></li>
                                          <li><a href="#"style="padding: 10px 10px;">Logout</a></li>
                                          <li><a href="#"style="padding: 10px 10px;">Manager Book</a></li>
                                          <li><a href="#" style="padding: 10px 10px;">Hello Admin</a></li>
                                   </ul>
                            </div>
                            <div class="hcenter-child-search">
                                   <form action="" method="" class="navbar-form navbar-right">
                                          <div class="form-group">
                                                 <input type="text" class="form-control" placeholder="Tim kiem sach">
                                          </div>
                                          <button type="submit" class="btn btn-default">Search</button>
                                   </form>
                            </div>
                     </div>

              </nav>
       </div>
</div>

<div class="container">
       <div class="line"></div>
       <div class='til_noti'>Sách ebook được sưu tầm từ Internet, Bản quyền sách thuộc về Tác giả & Nhà xuất bản
       </div>
</div>

