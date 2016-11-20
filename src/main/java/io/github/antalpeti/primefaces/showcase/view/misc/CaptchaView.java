package io.github.antalpeti.primefaces.showcase.view.misc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "miscCaptchaView")
public class CaptchaView {

  public void submit() {
    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
    FacesContext.getCurrentInstance().addMessage(null, msg);
  }
}
