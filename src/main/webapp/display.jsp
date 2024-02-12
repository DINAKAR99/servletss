<%@page isELIgnored="false"%> <%@ taglib prefix="sql" uri =
"http://java.sun.com/jsp/jstl/sql" %> <%@ taglib prefix="x" uri =
"http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="fn" uri =
"http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>jsp sql</title>
  </head>
  <body>
    <sql:setDataSource
      var="db"
      driver="org.postgresql.Driver"
      url="jdbc:postgresql://localhost:5433/myhiber2"
      user="postgres"
      password="dinakar1."
    />
    <sql:query dataSource="${db}" var="rs">select * from customer</sql:query>

    <x:forEach var="cust" items="${rs.rows}">
      <x:out value="${cust.first_name}" />
    </x:forEach>

    <x:set var="str" value="zommba is a good boy" />
    lenghth is : ${fn:length(str)}

    <x:forEach var="s" items="${fn:split(str,' ')}">

    <br>
    ${s}
    </x:forEach>
  </body>
</html>
