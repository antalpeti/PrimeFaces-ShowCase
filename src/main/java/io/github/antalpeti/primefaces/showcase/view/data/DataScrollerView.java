package io.github.antalpeti.primefaces.showcase.view.data;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

@ManagedBean(name = "dataDataScrollerView")
@ViewScoped
public class DataScrollerView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars;

  @ManagedProperty("#{carService}")
  private CarService service;

  @PostConstruct
  public void init() {
    cars = service.createCars(100);
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setService(CarService service) {
    this.service = service;
  }
}
