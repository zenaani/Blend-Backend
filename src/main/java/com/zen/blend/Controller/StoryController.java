package com.zen.blend.Controller;

import com.zen.blend.Model.Story;
import com.zen.blend.Service.StoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/story")
@CrossOrigin(origins = "*")
public class StoryController {

    StoryService storyService;
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @PostMapping()
    private String createStory(@RequestBody Story story) {
        storyService.createStory(story);
        return "Story Created Successfully";
    }

    @GetMapping("{userId}")
    private List<Story> getStoriesWithUserId(@PathVariable("userId") Long userId) {
        //Write Code
        return null;
    }
}
