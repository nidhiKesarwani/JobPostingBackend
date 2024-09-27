package org.nidhi.jobpostingproject.repository;

import org.nidhi.jobpostingproject.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository {
    List<Post> findByText(String text);
}
