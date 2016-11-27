package io.github.antalpeti.primefaces.showcase.view.misc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "miscDefaultCommandView")
public class DefaultCommandView {

  private String text;

  private String btn = "btn1";

  private List<String> buttons;

  @PostConstruct
  public void init() {
    buttons = new ArrayList<String>();
    buttons.add("btn1");
    buttons.add("btn2");
    buttons.add("btn3");
  }

  public String getBtn() {
    return btn;
  }

  public void setBtn(String btn) {
    this.btn = btn;
  }

  public List<String> getButtons() {
    return buttons;
  }

  public void setButtons(List<String> buttons) {
    this.buttons = buttons;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void addMessage(String btn) {
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Submitted with " + btn));
  }

  public void btn1Submit() {
    addMessage("btn1");
  }

  public void btn2Submit() {
    addMessage("btn2");
  }

  public void btn3Submit() {
    addMessage("btn3");
  }
}
