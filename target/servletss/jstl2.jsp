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
    <c:out value="${num1}" />

    <!-- <c:remove var="num1" /> -->
    ---------------

    <!-- <c:out value="${num1}" default="hello" /> -->
  </body>
</html>
