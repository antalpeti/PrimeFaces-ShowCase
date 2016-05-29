package io.github.antalpeti.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

@ManagedBean(name = "datatableContextMenuView")
@ViewScoped
public class ContextMenuView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars;

  private Car selectedCar;

  @ManagedProperty("#{carService}")
  private CarService service;

  @PostConstruct
  public void init() {
    cars = service.createCars(10);
  }

  public List<Car> getCars() {
    return cars;
  }

  public Car getSelectedCar() {
    return selectedCar;
  }

  public void setSelectedCar(Car selectedCar) {
    this.selectedCar = selectedCar;
  }

  public void setService(CarService service) {
    this.service = service;
  }

  public void deleteCar() {
    cars.remove(selectedCar);
    selectedCar = null;
  }
}
