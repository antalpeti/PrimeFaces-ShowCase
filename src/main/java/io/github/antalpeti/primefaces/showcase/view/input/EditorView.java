package io.github.antalpeti.primefaces.showcase.view.input;

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
