package io.github.antalpeti.primefaces.showcase.view.data.gmap;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.Circle;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;

@ManagedBean(name = "gMapCirclesView")
public class CirclesView implements Serializable {

  private static final long serialVersionUID = 1L;

  private MapModel circleModel;

  @PostConstruct
  public void init() {

    circleModel = new DefaultMapModel();

    // Shared coordinates
    LatLng coord1 = new LatLng(36.879466, 30.667648);
    LatLng coord4 = new LatLng(36.885233, 30.702323);

    // Circle
    Circle circle1 = new Circle(coord1, 500);
    circle1.setStrokeColor("#d93c3c");
    circle1.setFillColor("#d93c3c");
    circle1.setFillOpacity(0.5);

    Circle circle2 = new Circle(coord4, 300);
    circle2.setStrokeColor("#00ff00");
    circle2.setFillColor("#00ff00");
    circle2.setStrokeOpacity(0.7);
    circle2.setFillOpacity(0.7);

    circleModel.addOverlay(circle1);
    circleModel.addOverlay(circle2);
  }

  public MapModel getCircleModel() {
    return circleModel;
  }

  public void onCircleSelect(OverlaySelectEvent event) {
    FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage(FacesMessage.SEVERITY_INFO, "Circle Selected", null));
  }
}
