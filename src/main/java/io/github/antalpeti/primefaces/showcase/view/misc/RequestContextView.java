package io.github.antalpeti.primefaces.showcase.view.misc;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import io.github.antalpeti.primefaces.showcase.domain.User;

@ManagedBean(name = "miscRequestContextView")
public class RequestContextView {

  private User user;

  @PostConstruct
  public void init() {
    user = new User();

    if (!FacesContext.getCurrentInstance().isPostback()) {
      RequestContext.getCurrentInstance().execute("alert('This onload script is added from backing bean.')");
    }
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public void save() {
    RequestContext context = RequestContext.getCurrentInstance();
    context.addCallbackParam("saved", true); // basic parameter
    context.addCallbackParam("user", user); // pojo as json

    // execute javascript oncomplete
    context.execute("PrimeFaces.info('Hello from the Backing Bean');");

    // update panel
    context.update("form:panel");

    // scroll to panel
    context.scrollTo("form:panel");

    // add facesmessage
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Success", "Success"));
  }
}
