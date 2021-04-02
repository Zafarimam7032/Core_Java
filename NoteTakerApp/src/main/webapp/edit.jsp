<%@page import="com.helper.FactoryProvider"%>


<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.*"%>
<%@page import="javax.persistence.Query"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Edit your note</h1>
		<br>
		<%
		int noteId=Integer.parseInt(request.getParameter("note_id").trim());
		Session s=FactoryProvider.getFactory().openSession();
		
		s.close();
		%>
	
	
	<form action="UpdateServlet" method="post">
	
	<input value="<%=note.getTitle()%>" name="noteId" type="hidden">
		
  <div class="form-group">
    <label for="title">Note Title</label>
    <input name="title" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here"
    value="<%=note.getTitle()%>"/>
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea required id="content" placeholder="Enter your content here" class="form-control"
    style="height=300px;"
    <%= note.getContent() %>
    ></textarea>
  </div>
 	<div class="container text-center">
 	  <button type="submit" class="btn btn-success">Save your note</button>
 	</div>
</form>
	</div>

</body>
</html>