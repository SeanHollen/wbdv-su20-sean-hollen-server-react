package com.example.myapp.Repositories;

import com.example.myapp.models.Topic;
import com.example.myapp.models.Widget;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WidgetRepository
        extends CrudRepository<Widget, Integer> {

  List<Widget> findAllWidgets();
  List<Topic> findWidgetsForTopic(String topicId);
  Topic findWidgetById(String widgetId);
}
