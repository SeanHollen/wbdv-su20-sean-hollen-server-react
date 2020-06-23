package com.example.myapp.Services;

import com.example.myapp.Repositories.WidgetRepository;
import com.example.myapp.models.Topic;
import com.example.myapp.models.Widget;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TopicService {

  @Autowired
  WidgetRepository repository;

  List<Topic> topics = new ArrayList<Topic>();

  {
    topics.add(new Topic(123, "topic1", "", new ArrayList<>(), "123"));
    topics.add(new Topic(234, "topic 2", "", new ArrayList<>(), "123"));
    topics.add(new Topic(345, "topic 3", "", new ArrayList<>(), "123"));
    topics.add(new Topic(456, "topic 4", "", new ArrayList<>(), "234"));
    topics.add(new Topic(567, "topic 5", "", new ArrayList<>(), "345"));
  }


  public List<Topic> findAllTopics() {
    return topics;
  }

  public List<Topic> findTopicsForLesson(String lessonId) {
    List<Topic> result = new ArrayList<>();
    for (Topic t : topics) {
      if (t.getLessonId().equals(lessonId)) {
        result.add(t);
      }
    }
    return result;
  }

  public Topic findTopicById(int topicId) {
    for (Topic t : topics) {
      if (t.getId() == topicId) {
        return t;
      }
    }
    return null;
  }


  public Topic createTopic(String lid, Topic topic) {
    topic.setLessonId(lid);
    topics.add(topic);
    return topic;
  }


  public int updateTopic(int tid, Topic topic) {
    for (int i = 0; i < topics.size(); i++) {
      if (topics.get(i).getId() == tid) {
        topic.setId(tid);
        topics.set(i, topic);
        return 1;
      }
    }
    return 0;
  }


  public int deleteTopic(int tid) {
    for (Topic t : topics) {
      if (t.getId() == tid) {
        this.topics.remove(t);
        return 1;
      }
    }
    return 0;
  }

}
