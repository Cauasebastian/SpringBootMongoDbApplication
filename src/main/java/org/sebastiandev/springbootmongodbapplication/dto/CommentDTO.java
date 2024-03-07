package org.sebastiandev.springbootmongodbapplication.dto;

import java.util.Date;

public class CommentDTO implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {
    }
    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }
}
