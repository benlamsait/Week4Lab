<%-- 
    Document   : Viewnote
    Created on : Feb 5, 2023, 9:30:12 PM
    Author     : Ben Lam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>View note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
 
        <h2><Strong>View Note</h2>
        
        <p>Title: ${note.title}</p>
        <p>Contents:
            <br>
            ${note.contents}
        </p>
        <a href="note?edit">Edit</a>
    </body>
</html>
