package io.github.antalpeti.primefaces.showcase.view.overlay;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.MoveEvent;

@ManagedBean(name = "dialogView")
public class DialogView {

  public void destroyWorld() {
    addMessage("System Error", "Please try again later.");
  }

  public void handleClose(CloseEvent event) {
    addMessage(event.getComponent().getId() + " closed", "So you don't like nature?");
  }

  public void handleMove(MoveEvent event) {
    addMessage(event.getComponent().getId() + " moved",
        "Left: " + event.getLeft() + ", Top: " + event.getTop());
  }

  public void addMessage(String summary, String detail) {
    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
    FacesContext.getCurrentInstance().addMessage(null, message);
  }
}
