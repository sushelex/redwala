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
<title>SHOW BUSES</title>
</head>
<body>

	<table>
		<tr>
			<th>TRAVEL NAME</th>
			<th>TIMING</th>
			<th>SEAT</th>
			<th>FARE</th>
		</tr>
<%
	List list = new ArrayList();
	Busdetails bus = new Busdetails();
	Iterator itr = list.iterator();
	System.out.println("after iterator");
	list= (List)session.getAttribute("myBus");
	System.out.println("itr status"+itr.hasNext());
	while(itr.hasNext())
		{
			bus = (Busdetails)itr.next();
			if(bus != null)
			System.out.println("operator is"+bus.getTravelName());
			else
				System.out.println("operator is:null");	
		}
%>
<%-- 		<%=myBus.getTravelName() %> --%>
	</table>
		
</body>
</html>
