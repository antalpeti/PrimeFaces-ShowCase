package io.github.antalpeti.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.ColumnResizeEvent;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

@ManagedBean(name = "datatableResizableColumnsView")
public class ResizableColumnsView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars1;
  private List<Car> cars2;

  @ManagedProperty("#{serviceCarService}")
  private CarService service;

  @PostConstruct
  public void init() {
    cars1 = service.createCars(10);
    cars2 = service.createCars(10);
  }

  public void onResize(ColumnResizeEvent event) {
    FacesMessage msg = new FacesMessage("Column " + event.getColumn().getClientId() + " resized",
        "W:" + event.getWidth() + ", H:" + event.getHeight());
    FacesContext.getCurrentInstance().addMessage(null, msg);
  }

  public List<Car> getCars1() {
    return cars1;
  }

  public List<Car> getCars2() {
    return cars2;
  }

  public void setService(CarService service) {
    this.service = service;
  }
}
