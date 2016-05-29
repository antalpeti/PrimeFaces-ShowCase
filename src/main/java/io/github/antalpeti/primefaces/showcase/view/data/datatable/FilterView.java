package io.github.antalpeti.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import io.github.antalpeti.primefaces.showcase.domain.Car;
import io.github.antalpeti.primefaces.showcase.service.CarService;

@ManagedBean(name = "datatableFilterView")
@ViewScoped
public class FilterView implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Car> cars;

  private List<Car> filteredCars;

  @ManagedProperty("#{carService}")
  private CarService service;

  @PostConstruct
  public void init() {
    cars = service.createCars(10);
  }

  @SuppressWarnings("unchecked")
  public boolean filterByPrice(Object value, Object filter, Locale locale) {
    String filterText = filter == null ? null : filter.toString().trim();
    if (filterText == null || filterText.equals("")) {
      return true;
    }

    if (value == null) {
      return false;
    }

    return ((Comparable<Integer>) value).compareTo(Integer.valueOf(filterText)) > 0;
  }

  public List<String> getBrands() {
    return service.getBrands();
  }

  public List<String> getColors() {
    return service.getColors();
  }

  public List<Car> getCars() {
    return cars;
  }

  public List<Car> getFilteredCars() {
    return filteredCars;
  }

  public void setFilteredCars(List<Car> filteredCars) {
    this.filteredCars = filteredCars;
  }

  public void setService(CarService service) {
    this.service = service;
  }
}
