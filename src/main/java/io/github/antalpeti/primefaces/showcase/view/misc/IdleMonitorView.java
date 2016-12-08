package io.github.antalpeti.primefaces.showcase.view.misc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "miscIdleMonitorView")
public class IdleMonitorView {

  public void onIdle() {
    FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage(FacesMessage.SEVERITY_WARN, "No activity.", "What are you doing over there?"));
  }

  public void onActive() {
    FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage(FacesMessage.SEVERITY_WARN, "Welcome Back", "Well, that's a long coffee break!"));
  }
}
