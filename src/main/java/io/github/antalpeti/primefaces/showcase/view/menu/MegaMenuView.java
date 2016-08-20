package io.github.antalpeti.primefaces.showcase.view.menu;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "menuMegaMenuView")
public class MegaMenuView {

  private String orientation = "horizontal";

  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }
}
