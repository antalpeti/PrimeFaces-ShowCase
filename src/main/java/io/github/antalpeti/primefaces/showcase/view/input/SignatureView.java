package io.github.antalpeti.primefaces.showcase.view.input;

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
