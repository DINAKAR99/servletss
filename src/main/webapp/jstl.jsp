<%@page isELIgnored="false"%> <%@ taglib prefix="x" uri =
"http://java.sun.com/jsp/jstl/core" %> <%@page errorPage="errorPage.jsp"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>jsp tag libb</title>
  </head>
  <body>
    <h1>hello all</h1>

    <x:set var="Income" value="${4000*4}" />
    <x:out value="${Income}" />
    <x:if test="${3>2}">
      <h2>this is tiru block</h2>
    </x:if>

    <%! int n1=20; int n2=0; String content=null; %> <% int div=n1/n2; %> <%=
    div%> <%= content.length()%>
  </body>
</html>
