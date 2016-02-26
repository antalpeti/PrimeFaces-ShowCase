package io.github.antalpeti.primefaces.ajaxcore.showcase.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="ajaxcoreListenerView")
public class ListenerView {
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
     
    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
}