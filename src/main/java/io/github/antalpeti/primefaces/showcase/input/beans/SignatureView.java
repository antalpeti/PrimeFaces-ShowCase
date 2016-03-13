package io.github.antalpeti.primefaces.showcase.input.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inputSignatureView")
public class SignatureView {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
