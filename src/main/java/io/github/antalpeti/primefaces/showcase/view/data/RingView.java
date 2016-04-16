package io.github.antalpeti.primefaces.showcase.view.data;

import io.github.antalpeti.primefaces.showcase.domain.Car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean(name="dataRingView")
public class RingView implements Serializable {
     
	private static final long serialVersionUID = 1L;
	
	private List<Car> cars;
    private Car selectedCar;
     
    @PostConstruct
    public void init() {
        cars = new ArrayList<Car>();
         
        cars.add(new Car("1", "Ford", 2000, "Black"));
        cars.add(new Car("2", "Audi", 2003, "Orange"));
        cars.add(new Car("4", "BMW", 2012, "Red"));
        cars.add(new Car("5", "Fiat", 2001, "Yellow"));
        cars.add(new Car("6", "Mercedes", 2014, "Blue"));
    }
 
    public List<Car> getCars() {
        return cars;
    }
 
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}