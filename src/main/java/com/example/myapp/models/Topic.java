package com.example.myapp.models;

import java.util.List;

public class Topic {

  private int id;
  private String title;
  private String description;
  private List<Widget> widgets;
  private String lessonId;

  public Topic() {}

  public Topic(int id, String title, String description, List<Widget> widgets, String lessonId) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.widgets = widgets;
    this.lessonId = lessonId;
  }

  public String getLessonId() {
    return lessonId;
  }

  public void setLessonId(String lessonId) {
    this.lessonId = lessonId;
  }

  public List<Widget> getWidgets() {

    return widgets;
  }

  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
  }

  public String getDescription() {

    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {

    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
