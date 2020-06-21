package com.example.myapp.models;

public class Widget {
  private String name;
  private String id;
  private String type;
  private int widgetOrder;
  private String text;
  private String href;
  private int size;
  private int width, height;
  private String cssClass;
  private String style;
  private String value;
  private String topic;

  public Widget(String name, String id, String type, int widgetOrder,
                String text, String href, int size, int width, int height, String cssClass,
                String style, String value, String topic) {
    this(id, name, type, topic);
    this.widgetOrder = widgetOrder;
    this.text = text;
    this.href = href;
    this.size = size;
    this.width = width;
    this.height = height;
    this.cssClass = cssClass;
    this.style = style;
    this.value = value;
  }

  public Widget(String id, String name, String type, String topic) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.topic = topic;
  }

  public Widget() {
  }

  private String getName() {
    return this.name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getWidgetOrder() {
    return this.widgetOrder;
  }

  public void setWidgetOrder(int widgetOrder) {
    this.widgetOrder = widgetOrder;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getHref() {
    return this.href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getWidth() {
    return this.width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getCssClass() {
    return this.cssClass;
  }

  public void setCssClass(String cssClass) {
    this.cssClass = cssClass;
  }

  public String getStyle() {
    return this.style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getTopic() {
    return this.topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }
}
