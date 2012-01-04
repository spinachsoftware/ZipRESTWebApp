<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr">

<br>
<br>
<br>
<br>

<%@page import="org.apache.commons.lang.StringUtils"%>
<body>
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<h1 align="center">Welcome to the ZipLocator REST Service</h1>
<br>
<div class="tab">
<h4>Following REST Get Calls are available to use:</h4>

<% 
String zipcodeURL = StringUtils.chompLast(request.getRequestURL().toString(), request.getRequestURI())+"/rest/findbyzipcode/"; 
String cityURL = StringUtils.chompLast(request.getRequestURL().toString(), request.getRequestURI())+"/rest/findbycity/"; 
String stateURL = StringUtils.chompLast(request.getRequestURL().toString(), request.getRequestURI())+"/rest/findbystate/"; 
%>
<ol>

<li> <p>Enter the zipcode to find city and state info <br><b><i><%= zipcodeURL+"{zipcode}" %></b></i> e.g. check the link <a href=<%= zipcodeURL+"55401" %>> <%= zipcodeURL+"55401" %></a></li>
<li> <p>Enter the city name to find all zipcodes belonging to that city <br><b><i><%= cityURL+"{cityName}" %></b></i> e.g. check the link <a href=<%= cityURL+"Minneapolis" %>> <%= cityURL+"Minneapolis" %></a></li>
<li> <p>Enter the state name to find all city/zipcode combination belonging to that state <br><b><i><%= stateURL+"{stateName}" %></b></i> e.g. check the link <a href=<%= stateURL+"Minnesota" %>> <%= stateURL+"Minnesota" %></a></li>
</ol>
</div>
</body>
<div id="footer">

		<div class="left" id="footer-left">
		<p class="quiet"><img src="img/spinachLogo_small.JPG" alt="left" /> &copy; 2011 <a href="http://www.spinachsoftware.com/">Spinach Software & Consulting.</a> All rights Reserved</p>
		<div class="clearer">&nbsp;</div>
</div>		
</html> 