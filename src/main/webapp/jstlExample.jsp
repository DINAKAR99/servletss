<%@page isELIgnored="false"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>jstl core tags</title>
  </head>
  <body>
    <c:set var="num1" value="50" scope="application" />
    ---------------
    <c:out value="${num1}" />

    ---------------
    <c:if test="${num1==50}"> YES THE VALUE IS 50 </c:if>
    ---------------

    <c:choose>
      <c:when test="${num1==4}"> 1ST STATEMENT</c:when>
      <c:when test="${num1==40}"> SEC STATEMNET</c:when>
      <c:when test="${num1==50}"> THIRD STATEMENT</c:when>
      <c:otherwise> DEFALUT</c:otherwise>
    </c:choose>
    ---------------

    <c:forEach var="j" begin="1" end="10">
      <c:out value="${j}" />
    </c:forEach>

    ----------------- --------------------

    <c:url value="https://www.google.com/search" var="murl">
      <c:param name="q" value="hockey" />
    </c:url>

    <c:out value="${murl}" />

    ---------------------
  </body>
</html>
