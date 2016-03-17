package io.github.antalpeti.primefaces.showcase.input.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inputInplaceView")
public class InplaceView implements Serializable {

  private static final long serialVersionUID = 1L;

  private String text = "PrimeFaces";

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
