package org.sebastiandev.springbootmongodbapplication.domain;

import org.sebastiandev.springbootmongodbapplication.dto.AuthorDTO;
import org.sebastiandev.springbootmongodbapplication.dto.CommentDTO;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String content;
    private AuthorDTO author;

    private List<CommentDTO> comments = new ArrayList<>();

    public Post() {

    }

    public Post(String id, Date date, String title, String content, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        return getId() != null ? getId().equals(post.getId()) : post.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
