package io.github.antalpeti.primefaces.showcase.view.data.dataexporter;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "dataexporterDataExporterView")
public class DataExporterView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars;

  @ManagedProperty("#{serviceCarService}")
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
