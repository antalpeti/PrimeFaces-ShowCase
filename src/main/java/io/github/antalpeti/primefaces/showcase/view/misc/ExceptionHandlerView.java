package io.github.antalpeti.primefaces.showcase.view.misc;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "miscExceptionHandlerView")
@RequestScoped
public class ExceptionHandlerView {

  public void throwNullPointerException() {
    throw new NullPointerException("A NullPointerException!");
  }

  public void throwWrappedIllegalStateException() {
    Throwable t = new IllegalStateException("A wrapped IllegalStateException!");
    throw new FacesException(t);
  }

  public void throwViewExpiredException() {
    throw new ViewExpiredException("A ViewExpiredException!",
        FacesContext.getCurrentInstance().getViewRoot().getViewId());
  }
}
