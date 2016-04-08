package io.github.antalpeti.primefaces.showcase.data;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dataDataListView")
@ViewScoped
public class DataListView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars1;

  private List<Car> cars2;

  private List<Car> cars3;

  private Car selectedCar;

  @ManagedProperty("#{serviceCarService}")
  private CarService service;

  @PostConstruct
  public void init() {
    cars1 = service.createCars(10);
    cars2 = service.createCars(5);
    cars3 = service.createCars(50);
  }

  public List<Car> getCars1() {
    return cars1;
  }

  public List<Car> getCars2() {
    return cars2;
  }

  public List<Car> getCars3() {
    return cars3;
  }

  public void setService(CarService service) {
    this.service = service;
  }

  public Car getSelectedCar() {
    return selectedCar;
  }

  public void setSelectedCar(Car selectedCar) {
    this.selectedCar = selectedCar;
  }
}
