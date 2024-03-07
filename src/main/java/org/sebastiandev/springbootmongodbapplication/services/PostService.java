package org.sebastiandev.springbootmongodbapplication.services;

import org.sebastiandev.springbootmongodbapplication.domain.Post;
import org.sebastiandev.springbootmongodbapplication.domain.User;
import org.sebastiandev.springbootmongodbapplication.dto.UserDTO;
import org.sebastiandev.springbootmongodbapplication.reposistory.PostRepository;
import org.sebastiandev.springbootmongodbapplication.reposistory.UserRepository;
import org.sebastiandev.springbootmongodbapplication.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<Post> findAll() {
        return repo.findAll();
    }
    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }
    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate);
    }
}
