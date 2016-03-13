package io.github.antalpeti.primefaces.showcase.input.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inputSelectOneView")
public class SelectOneView {

  private String option;

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }
}
