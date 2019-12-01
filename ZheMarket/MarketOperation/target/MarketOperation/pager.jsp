<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.js"></script>
<link href="<%=request.getContextPath()%>/bootstrap/bootstrap3/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<body>
 <div>
	 <%-- 构建分页导航 --%>
	  <button type="button" value="" onclick="search(1);"  class="btn btn-danger" >
	   <span class="glyphicon glyphicon-play"></span>首页</button>
            <%--如果当前页为第一页时，就没有上一页这个超链接显示 --%>
            <c:if test="${pager.pageNum ==1}">
                <c:forEach begin="${pager.start}" end="${pager.end}" step="1" var="i">
                    <c:if test="${pager.pageNum == i}">
                        <font color="red">${i}</font>
                    </c:if>                
                    <c:if test="${pager.pageNum != i}">
                        <span onclick="search(${i});">${i}</span>                                        
                    </c:if>                        
                </c:forEach>
                <%--如果当前页为第一页时，如果总页数=1 没有下一页  就没有上一页这个超链接显示 --%>
                <c:if test="${pager.totalPage > 1}">
                  <button type="button" value="" onclick="search(${pager.pageNum+1})"  class="btn btn-danger" >
	   <span class="glyphicon glyphicon-chevron-right"></span>下一页</button>
                </c:if>
            </c:if>
            
            <%--如果当前页不是第一页也不是最后一页，则有上一页和下一页这个超链接显示 --%>
            <c:if test="${pager.pageNum > 1 && pager.pageNum < pager.totalPage}">
            
                      <button type="button" value="" onclick="search(${pager.pageNum-1})"  class="btn btn-danger" >
	   <span class="glyphicon glyphicon-play"></span>上一页</button>
            
             
             
             
             
             
                <c:forEach begin="${pager.start}" end="${pager.end}" step="1" var="i">
                    <c:if test="${pager.pageNum == i}">
                        <font color="red">${i}</font>
                    </c:if>            
                    <c:if test="${pager.pageNum != i}">
                        <span onclick="search(${i})">${i}</span>                                  
                    </c:if>                        
                </c:forEach>
                <input type="button" value="下一页" onclick="search(${pager.pageNum+1})"/>
            </c:if>
            
            <%-- 如果当前页是最后一页，则只有上一页这个超链接显示，下一页没有 --%>
            <c:if test="${pager.pageNum == pager.totalPage}">
            	 <%-- 如果当前页是最后一页，并且当前页>1显示上一页--%>
             	<c:if test="${pager.totalPage > 1}">
             	
             	
             	                <button type="button" value="" onclick="search(${pager.pageNum-1})"  class="btn btn-danger" >
	   <span class="glyphicon glyphicon-chevron-left"></span>上一页</button>
                </c:if>
                <c:forEach begin="${pager.start}" end="${pager.end}" step="1" var="i">
                    <c:if test="${pager.pageNum == i&&i!=1}">
                        <font color="red">${i}</font>
                    </c:if>
                    <c:if test="${pager.pageNum != i}">
                        <span onclick="search(${i})">${i}</span>                                        
                    </c:if>                
                </c:forEach>
            </c:if>
            <%--尾页 --%>
             <button type="button"  onclick="search(${pager.totalPage})" class="btn btn-danger" >尾页</button>
                        共有${pager.totalRecord}个记录，共${pager.totalPage }页<%-- ，当前为${pager.pageNum}页 --%>
	</div>

</body>
</html>