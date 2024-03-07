package org.sebastiandev.springbootmongodbapplication.reposistory;

import org.sebastiandev.springbootmongodbapplication.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
