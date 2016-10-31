package io.github.antalpeti.primefaces.showcase.view.dnd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.DragDropEvent;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

@ManagedBean(name = "dndDNDCarsView")
@ViewScoped
public class DNDCarsView implements Serializable {

  private static final long serialVersionUID = 1L;

  @ManagedProperty("#{carService}")
  private CarService service;

  private List<Car> cars;

  private List<Car> droppedCars;

  private Car selectedCar;

  @PostConstruct
  public void init() {
    cars = service.createCars(9);
    droppedCars = new ArrayList<Car>();
  }

  public void onCarDrop(DragDropEvent ddEvent) {
    Car car = ((Car) ddEvent.getData());

    droppedCars.add(car);
    cars.remove(car);
  }

  public void setService(CarService service) {
    this.service = service;
  }

  public List<Car> getCars() {
    return cars;
  }

  public List<Car> getDroppedCars() {
    return droppedCars;
  }

  public Car getSelectedCar() {
    return selectedCar;
  }

  public void setSelectedCar(Car selectedCar) {
    this.selectedCar = selectedCar;
  }
}
