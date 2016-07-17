package io.github.antalpeti.primefaces.showcase.domain;

import java.io.Serializable;
import java.util.Date;

public class Mail implements Serializable {

  private static final long serialVersionUID = 1L;

  public String from;
  public String subject;
  public String body;
  public Date date;

  public Mail() {}

  public Mail(String from, String subject, String body, Date date) {
    this.from = from;
    this.subject = subject;
    this.body = body;
    this.date = date;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
