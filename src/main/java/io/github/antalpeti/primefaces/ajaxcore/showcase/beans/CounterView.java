package io.github.antalpeti.primefaces.ajaxcore.showcase.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="ajaxcoreCounterView")
@ViewScoped
public class CounterView implements Serializable {
     
	private static final long serialVersionUID = -3263329010974817455L;
	
	private int number;
 
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}