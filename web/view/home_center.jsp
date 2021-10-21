<%-- 
    Document   : home_center
    Created on : Oct 20, 2021, 5:21:10 PM
    Author     : Tebellum
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-xs-12 col-sm-8 col-md-8 col-lg-8">
    <div class="content_page">
        <div class="title_page">Tất cả sách</div>
        <div class="pd-lr-20">
            <div class="mg-b-30">
            </div>
            <div class="row r_10">
                <c:forEach items="${requestScope.books}" var="b">

                    <div class="col-xs-6 col-sm-3 col-md-3 col-lg-3 mg-b-30 item_sach">
                        <div class="">
                            <a href="https://nhasachmienphi.com/bo-sach-giao-khoa-lop-11.html"><img
                                    class="medium_thum"
                                    src="https://nhasachmienphi.com/wp-content/uploads/tu-huyet-cam-xuc.jpg"></a>
                        </div>
                        <h4 class="mg-t-10"><a class="title_sach"
                                               href="https://nhasachmienphi.com/bo-sach-giao-khoa-lop-11.html">${b.book_name}</a></h4>
                    </div>
                </c:forEach>

                <div class="col-xs-6 col-sm-3 col-md-3 col-lg-3 mg-b-30 item_sach">
                    <div class="">
                        <a href="https://nhasachmienphi.com/bo-sach-giao-khoa-lop-7.html"><img
                                class="medium_thum"
                                src="https://nhasachmienphi.com/wp-content/uploads/tu-huyet-cam-xuc.jpg"></a>
                    </div>
                    <h4 class="mg-t-10"><a class="title_sach"
                                           href="https://nhasachmienphi.com/bo-sach-giao-khoa-lop-7.html">Bộ Sách Giáo Khoa
                            lớp 7</a></h4>
                </div>

            </div>
        </div>
    </div>
</div>