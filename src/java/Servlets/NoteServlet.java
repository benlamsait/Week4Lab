/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Note;

/**
 *
 * @author Ben Lam
 */
public class NoteServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title, contents;
        title =br.readLine();
        contents =br.readLine();
        Note note = new Note(title,contents);
        System.out.println(title + " " + contents);
    
        request.setAttribute("note", note);
        
        if(request.getParameter("edit") == null){
            getServletContext().getRequestDispatcher("/WEB-INF/Viewnote.jsp").forward(request, response);            
        } else if(request.getParameter("edit") != null){
             getServletContext().getRequestDispatcher("/WEB-INF/Editnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        Note note = new Note(title, contents);
        
        request.setAttribute("note", note);
        getServletContext().getRequestDispatcher("/WEB-INF/Viewnote.jsp").forward(request, response);
        return;

    }
}

