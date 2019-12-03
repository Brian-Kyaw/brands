<%@include file="/apps/brands/global/global.jsp" %>
<%@page	import="com.brands.core.models.*,com.brands.core.controller.*"%>
<%
  
  BasicController basicController = new BasicController();
  Basic basic = new Basic();
  basic = basicController.getBasicHeaderFields(currentPage, isAuthor);
  
  int currentPageLevel = currentPage.getDepth();
%>
<c:set var="headerTitle" value="<%=  basic.getTitle() %>"/>
<c:set var="currentPageLevel" value="<%= currentPageLevel %>"/>

<c:if test="${currentPageLevel ==  4}">
	 <h1><c:out value="${headerTitle}"/></h1>
</c:if>

<c:if test="${currentPageLevel == 5}">
    <h2><c:out value="${headerTitle}"/></h2>
</c:if>

