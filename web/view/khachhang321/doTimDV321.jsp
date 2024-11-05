<%-- 
    Document   : doTimDV321
    Created on : Oct 28, 2024, 12:12:27 AM
    Author     : Admin
--%>

<%@page import="dao.Dichvu321DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
         import="java.util.ArrayList, java.util.List,java.net.URLEncoder, dao.Dichvu321DAO, model.*"%>
<%
    String tenDV = request.getParameter("tenDV");
    if (tenDV != null) {
        Dichvu321DAO dichvu321DAO = new Dichvu321DAO();
        List<Dichvu321> dvs = dichvu321DAO.getDVtheoten(tenDV);
        if(dvs == null || dvs.isEmpty()) session.setAttribute("errorMessage", "Không tìm thấy dịch vụ.");
        session.setAttribute("dsDV", dvs);
        String encodedTenDV = URLEncoder.encode(tenDV, "UTF-8");
        response.sendRedirect("GDtimDV321.jsp?tenDV="+encodedTenDV);
        System.out.println(tenDV);
        return;
    }

    String action = request.getParameter("action");
    if (action != null && action.equals("chitietDV")) {
        String idDV = new String(request.getParameter("idDV"));
        List<Dichvu321> dvs = (ArrayList<Dichvu321>) session.getAttribute("dsDV");
        if (dvs != null ) {
            Dichvu321 dichvu321 = dvs.stream()
                    .filter(dv -> dv.getIdDV().equals(idDV))
                    .findFirst()
                    .orElse(null);

            if (dichvu321 != null) {
                session.setAttribute("chitietDV", dichvu321);
                response.sendRedirect("/WEBGARAMAN/kh/GDchitietDV321.jsp");
                return;
            }
        } else {
            //session.setAttribute("errorMessage", "Không tìm thấy dịch vụ.");
            response.sendRedirect("GDtimDV321.jsp");
        }
        return;
    } else if(action!=null && action.equals("trangchu")){
           session.setAttribute("dsDV", null);
           response.sendRedirect("GDchinhKH321.jsp");
    }
    


%>

