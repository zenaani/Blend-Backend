package com.zen.blend.Service;

import com.zen.blend.Model.Story;

import java.util.List;

public interface StoryService {
    public void createStory(Story story);

    public List<Story> getStoriesWithUserId(Long userId);

}
