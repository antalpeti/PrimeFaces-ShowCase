package io.github.antalpeti.primefaces.showcase.input.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inputEditorView")
public class EditorView {

  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
