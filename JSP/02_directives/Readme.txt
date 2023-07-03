The jsp directives are messages that tells the web container how to translate 
a JSP page into the corresponding servlet.

Syntax of directive
<%@ directive attribute="value" %>  

There are three type of directives

1.) page directive

<%@ page attribute="value" %> 

Attributes of JSP page directive

import
contentType
extends
info
buffer
language
isELIgnored
isThreadSafe
autoFlush
session
pageEncoding
errorPage
isErrorPage

2.) include directive

<%@ include file="resourceName" %> 

3.) taglib directive

<%@ taglib uri="uriofthetaglibrary" prefix="prefixoftaglibrary" %> 