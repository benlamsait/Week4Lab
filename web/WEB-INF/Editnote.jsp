<%-- 
    Document   : Editnote
    Created on : Feb 5, 2023, 9:50:07 PM
    Author     : Ben Lam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Edit Note</h1>
        <form method="POST" action="note">
        <p>Title: <input type="text" name="title" value="${note.title}"></p>
        <p>Contents:
            <textarea name="contents" rows="4" cols="50">${note.contents}</textarea>
        </p>
        <input type="submit" value="save"> 
        </form>
    </body>
</html>
