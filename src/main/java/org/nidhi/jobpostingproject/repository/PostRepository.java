package org.nidhi.jobpostingproject.repository;

import org.nidhi.jobpostingproject.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>    {
}
