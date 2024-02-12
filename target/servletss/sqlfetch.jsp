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
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <h1>all customers are</h1>

    <sql:setDataSource
      var="dat"
      driver="org.postgresql.Driver"
      url="jdbc:postgresql://localhost:5433/myhiber2"
      user="postgres"
      password="dinakar1"
    />

    <sql:query dataSource="${dat}" var="result"
      >select * from customer;
    </sql:query>

    <div class="container">
      <div class="table">
        <tr>
          <td>user first name</td>
          <td>user last name</td>
        </tr>
      </div>
    </div>

    <x:forEach var="ss" items="${result.rows}">
      <tr>
        <td><x:out value="${ss.first_name}" /></td>
        <td><x:out value="${ss.last_name}" /></td>
      </tr>
    </x:forEach>
  </body>
</html>
