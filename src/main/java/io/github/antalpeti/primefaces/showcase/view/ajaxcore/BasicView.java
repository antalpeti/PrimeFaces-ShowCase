package io.github.antalpeti.primefaces.showcase.view.ajaxcore;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="ajaxcoreBasicView")
public class BasicView {
    
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}