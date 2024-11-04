<%-- 
    Document   : GDchitietDV321
    Created on : Oct 28, 2024, 12:23:46 AM
    Author     : Admin
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="model.Dichvu321" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GARAMAN</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f9;
                color: #333;
                margin: 0;
                padding: 20px;
            }
            .container {
                max-width: 800px;
                margin: 0 auto;
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            h1 {
                text-align: center;
                color: #4CAF50;
            }
            .item-details {
                margin-top: 20px;
                font-size: 18px;
            }
            .item-details p {
                margin: 5px 0;
            }
            .back-button {
                display: block;
                margin: 20px auto;
                padding: 10px 20px;
                background-color: #4CAF50;
                color: white;
                text-align: center;
                border-radius: 4px;
                text-decoration: none;
                font-size: 16px;
            }
            .back-button:hover {
                background-color: #45a049;
            }
            .error-message {
                color: red;
                font-weight: bold;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Thông tin chi tiết dịch vụ</h1>
            <%
                // Lấy mặt hàng từ session
                Dichvu321 dichvu321 = (Dichvu321) session.getAttribute("chitietDV");
                
                if (dichvu321 != null) {
            %>
            <div class="item-details">
                <p><strong>Mã dịch vụ:</strong> <%= dichvu321.getIdDV()%></p>
                <p><strong>Tên dịch vụ:</strong> <%= dichvu321.getTen() %></p>
                <p><strong>Đơn giá:</strong> <%= new java.text.DecimalFormat("#,###.##").format(dichvu321.getDonGia()) %> VNĐ</p>
                <p><strong>Mô tả:</strong> <%= dichvu321.getMoTa()!= null ? dichvu321.getMoTa(): "" %></p>
            </div>
            <%
                } else {
            %>
            <h4 class="error-message">Không tìm thấy thông tin dịch vụ.</h4>
            <%
                }
            %>
            <!-- Nút quay lại -->
            <!--<a href="GDtimDV321.jsp?tenDV="+tenDV class="back-button">Quay lại trang tìm dịch vụ</a>-->
            <a href="GDtimDV321.jsp" class="back-button">Quay lại trang tìm dịch vụ</a>
        </div>
    </body>
</html>