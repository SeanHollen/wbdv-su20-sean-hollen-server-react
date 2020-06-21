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

import com.example.myapp.models.Widget;
import com.example.myapp.Services.WidgetService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

  @Autowired
  WidgetService widgetService;

  @PostMapping("/api/topics/{tid}/widget")
  Widget createWidget(
          @PathVariable("tid") String tid,
          @RequestBody Widget widget) {
    return widgetService.createWidget(tid, widget);
  }

  @GetMapping("/api/topics/{tid}/widgets")
  List<Widget> findWidgetsForTopic(
          @PathVariable("tid") String tid) {
    return widgetService.findWidgetsForTopic(tid);
  }

  @GetMapping("/api/widgets")
  List<Widget> findAllWidgets() {
    return widgetService.findAllWidgets();
  }

  @PutMapping("/api/widgets/{wid}")
  int updateWidget(
          @PathVariable("wid") String wid,
          @RequestBody Widget widget) {
    return widgetService.updateWidget(wid, widget);
  }

  @DeleteMapping("/api/widgets/{wid}")
  int deleteWidget(
          @PathVariable("wid") String wid) {
    return widgetService.deleteWidget(wid);
  }

}


