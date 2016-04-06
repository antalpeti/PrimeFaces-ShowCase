package io.github.antalpeti.primefaces.showcase.data;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dataCarouselView")
@ViewScoped
public class CarouselView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars;

  private Car selectedCar;

  @ManagedProperty("#{serviceCarService}")
  private CarService service;

  @PostConstruct
  public void init() {
    cars = service.createCars(9);
  }

  public List<Car> getCars() {
    return cars;
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
