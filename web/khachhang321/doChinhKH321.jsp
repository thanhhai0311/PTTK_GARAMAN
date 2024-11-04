<%-- 
    Document   : doChinhKH321
    Created on : Oct 27, 2024, 12:28:17 AM
    Author     : Admin
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.ArrayList,model.*"%>

<%
    // Lấy tham số `action` từ URL
    String action = request.getParameter("action");

    if (action != null) {
        if (action.equals("datlich")) {
            response.sendRedirect("GDchinhKH321.jsp");
        } else if (action.equals("timdichvu")) {
            response.sendRedirect("GDtimDV321.jsp");
        } else {
            response.sendRedirect("GDchinhKH321.jsp");
        }
    } else {
        response.sendRedirect("GDchinhKH321.jsp");
    }
%>
