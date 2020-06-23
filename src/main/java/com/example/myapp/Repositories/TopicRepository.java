package com.example.myapp.Repositories;

import com.example.myapp.models.Topic;
import com.example.myapp.models.Widget;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository
        extends CrudRepository<Topic, Integer> {

  List<Topic> findAllTopics();
  List<Topic> findTopicsForLesson(String lessonId);
  Topic findTopicById(int topicId);

}
