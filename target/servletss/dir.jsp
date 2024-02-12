<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ page import="java.util.Random, java.sql.*"%> <%@
page session="false"%> <%@ page isErrorPage="true"%>

<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>first jsp</title>

    <style>
      body {
        margin: 0;
      }
    </style>
  </head>
  <body>
    <%@ include file="Header.jsp"%> <% Random r=new Random(); int n=
    r.nextInt(10); out.println(n); %>
  </body>
</html>
