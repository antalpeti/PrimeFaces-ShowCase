package io.github.antalpeti.primefaces.showcase.view.misc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "miscSpotlightView")
public class SpotlightView {

  private String username;

  private String email;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void save() {
    username = null;
    email = null;
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
  }
}
