<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html" %>
<%@ taglib prefix="html"    uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean"    uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic"   uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="tiles" uri="/tiles/resources/struts-tiles.tld" %>

<html:html lang="true" xhtml="true">
    <head>
        <title>A Tiles View</title>
    </head>
        <tiles:insert attribute="body" />
    </body>
</html:html>