package io.github.antalpeti.primefaces.showcase.view.df;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import io.github.antalpeti.primefaces.showcase.domain.Car;

@ManagedBean(name = "dfView")
public class DFView {

  public void viewCars() {
    Map<String, Object> options = new HashMap<String, Object>();
    options.put("resizable", false);
    RequestContext.getCurrentInstance().openDialog("viewCars", options, null);
  }

  public void viewCarsCustomized() {
    Map<String, Object> options = new HashMap<String, Object>();
    options.put("modal", true);
    options.put("width", 640);
    options.put("height", 340);
    options.put("contentWidth", "100%");
    options.put("contentHeight", "100%");
    options.put("headerElement", "customheader");

    RequestContext.getCurrentInstance().openDialog("viewCars", options, null);
  }

  public void chooseCar() {
    RequestContext.getCurrentInstance().openDialog("selectCar");
  }

  public void onCarChosen(SelectEvent event) {
    Car car = (Car) event.getObject();
    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + car.getId());

    FacesContext.getCurrentInstance().addMessage(null, message);
  }

  public void showMessage() {
    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");

    RequestContext.getCurrentInstance().showMessageInDialog(message);
  }
}
