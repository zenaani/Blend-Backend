package com.zen.blend.Service;

import com.zen.blend.Model.Post;

import java.util.List;

public interface PostService {

    public void createPost(Post post);
    public List<Post> getAllPosts();

}
