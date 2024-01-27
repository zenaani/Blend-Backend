package com.zen.blend.Controller;

import com.zen.blend.Model.Post;
import com.zen.blend.Service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "*")
public class PostController {

    PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping()
    public String createPost(@RequestBody Post post) {
        postService.createPost(post);
        return "Post Created Successfully";
    }

    @GetMapping()
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

}
