package org.nidhi.jobpostingproject.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.nidhi.jobpostingproject.model.Post;
import org.nidhi.jobpostingproject.repository.PostRepository;
import org.nidhi.jobpostingproject.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
       return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> getPostsByText(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
           return postRepository.save(post);
    }
}
