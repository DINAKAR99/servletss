<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>first jsp</title>
  </head>
  <body>
    <h1>first jsp</h1>
    <%! int a=11; int b=222; String name="jhon"; int doSum(){ return a+b; }
    public String reverse(){ StringBuffer sb=new StringBuffer(name); return
    sb.reverse().toString(); } %> <% out.println(a); out.println("<br />");
    out.println(b); out.println("<br />"); out.println("sum ="+doSum());
    out.println("reverse ="+reverse()); %>

    <h1>sum is : <%= doSum()%></h1>
    <h1>sum is : <%= a%></h1>
    <h1>sum is : <%= reverse()%></h1>
  </body>
</html>
