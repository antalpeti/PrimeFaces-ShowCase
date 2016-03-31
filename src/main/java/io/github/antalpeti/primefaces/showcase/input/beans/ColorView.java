package io.github.antalpeti.primefaces.showcase.input.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inputColorView")
public class ColorView {

  private String colorInline;
  private String colorPopup;

  public String getColorInline() {
    return colorInline;
  }

  public void setColorInline(String colorInline) {
    this.colorInline = colorInline;
  }

  public String getColorPopup() {
    return colorPopup;
  }

  public void setColorPopup(String colorPopup) {
    this.colorPopup = colorPopup;
  }
}
