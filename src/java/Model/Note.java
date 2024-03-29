/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ben Lam
 */
import java.io.Serializable;

public class Note implements Serializable {
    
    private String title;
    private String contents;
    
    public Note(){
        
        this.title = "";
        this.contents = "";
    }
    
    public Note(String title, String contents){
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Note{" + "title=" + title + ", contents=" + contents + '}';
    }
    
    
    
    
    
}