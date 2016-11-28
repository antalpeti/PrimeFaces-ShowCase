package io.github.antalpeti.primefaces.showcase.view.misc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "miscEffectView")
public class EffectView {

  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void echo() {
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You said:'" + text + "'"));
  }
}
