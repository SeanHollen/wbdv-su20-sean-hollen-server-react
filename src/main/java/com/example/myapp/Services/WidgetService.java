package com.example.myapp.Services;
import com.example.myapp.Repositories.WidgetRepository;
import com.example.myapp.models.Widget;
//import com.example.myapp.Repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@Service
@CrossOrigin(origins = "*")
public class WidgetService {

  @Autowired
  WidgetRepository repository;

  List<Widget> widgets = new ArrayList<Widget>();

  {
    widgets.add(new Widget("123", "Widget 1", "HEADING", "Topic1"));
    widgets.add(new Widget("234", "Widget 2", "PARAGRAPH", "Topic1"));
    widgets.add(new Widget("345", "Widget 3", "YOUTUBE", "Topic2"));
    widgets.add(new Widget("432", "Widget 4", "IMAGE", "Topic2"));
    widgets.add(new Widget("567", "Widget 5", "PARAGRAPH", "Topic3"));
  }

  public Widget findWidgetById(Integer wid) {
    for (Widget w : widgets) {
      if (w.getId().equals(wid)) {
        return w;
      }
    }
    return null;
  }

  public List<Widget> findWidgetsForTopic(String tid) {
    List<Widget> result = new ArrayList<Widget>();
    for (Widget w : widgets) {
      if (w.getTopic().equals(tid)) {
        result.add(w);
      }
    }
    return result;
  }

  public List<Widget> findAllWidgets() {
    return widgets;
  }

  public int deleteWidget(String wid) {
    for (Widget w : widgets) {
      if (!(w.getId().equals(wid))) {
        widgets.remove(w);
        return 1;
      }
    }
    return 0;
  }

  public Widget createWidget(String tid, Widget newWidget) {
    newWidget.setId("" + widgets.size() * 20);
    newWidget.setTopic(tid);
    this.widgets.add(newWidget);
    return newWidget;
  }

  public int updateWidget(String widgetId, Widget updatedWidget) {
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId().equals(widgetId)) {
        updatedWidget.setId(widgetId);
        widgets.set(i, updatedWidget);
        return 1;
      }
    }
    return 0;
  }
}
