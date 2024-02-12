<%@page isELIgnored="false"%> <%@ taglib prefix="fn" uri =
"http://java.sun.com/jsp/jstl/functions" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>jsp sql</title>
  </head>
  <body>
    <c:set var="name" value="cenTr for gg" />

    <c:out value="${name}" />

    length is : <c:out value="${fn:length(name)}" /> lower case
    <c:out value="${fn:toLowerCase(name)}" />
  </body>
</html>
