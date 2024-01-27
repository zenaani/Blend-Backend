package com.zen.blend.Service;

import com.zen.blend.Model.Story;
import com.zen.blend.Repository.StoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {

    StoryRepository storyRepository;
    public StoryServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public void createStory(Story story) {
        storyRepository.save(story);
    }

    @Override
    public List<Story> getStoriesWithUserId(Long userId) {
        //Business Logic
        return null;
    }

}
