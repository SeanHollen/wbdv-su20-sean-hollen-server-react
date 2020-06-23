package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.Services.TopicService;
import com.example.myapp.models.Topic;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TopicController {

  @Autowired
  TopicService topicService;

  @PostMapping("/api/lessons/{lid}/topics")
  Topic createTopic (@PathVariable("tid") String lid, @RequestBody Topic topic) {
    return topicService.createTopic(lid, topic);
  }

  @GetMapping("/api/lessons/{lid}/topics")
  List<Topic> findTopicsForLesson(@PathVariable("lid") String lid) {
    return topicService.findTopicsForLesson(lid);
  }

  @PostMapping("/api/topics/{tid}")
  int updateTopic(@PathVariable("tid") int tid, @RequestBody Topic topic) {
    return topicService.updateTopic(tid, topic);
  }

  @DeleteMapping("/api/topics/{tid}")
  int deleteTopic(@PathVariable("tid") int tid) {
    return topicService.deleteTopic(tid);
  }

  @GetMapping("/api/topics")
  List<Topic> findAllTopics() {
    return topicService.findAllTopics();
  }

  @GetMapping("/api/topics/{tid}")
  Topic findTopicById(@PathVariable("tid") int tid) {
    return topicService.findTopicById(tid);
  }

}


