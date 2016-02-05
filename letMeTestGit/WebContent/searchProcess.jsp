<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="dao.*" %>
<%@ page import="pojo.*" %>
<%@ page import="utils.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCHING</title>
</head>
<body>
<%
	Travel trv = new Travel();
	trv.setSourc(request.getParameter("source"));
	trv.setDestination(request.getParameter("destination"));
	String str = request.getParameter("distance");
	System.out.println("string distance is:"+str);
//	int dis = Integer.parseInt(str);
//	System.out.println("parsed int is:"+dis);
//	trv.setDistance(dis);
	RedDao red = new RedDao();
	List<Busdetails> bus1 = red.searchBus(trv);
	List<Busdetails>bus = new ArrayList<Busdetails>(bus1.size());
	session.setAttribute("myBus", bus);
	
	response.sendRedirect("showBus.jsp");
%>
</body>
</html>
