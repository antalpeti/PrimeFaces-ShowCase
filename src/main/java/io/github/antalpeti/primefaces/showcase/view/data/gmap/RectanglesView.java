package io.github.antalpeti.primefaces.showcase.view.data.gmap;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.LatLngBounds;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Rectangle;

@ManagedBean(name = "gMapRectanglesView")
public class RectanglesView implements Serializable {

  private static final long serialVersionUID = 1L;

  private MapModel rectangleModel;

  @PostConstruct
  public void init() {
    rectangleModel = new DefaultMapModel();

    // Shared coordinates
    LatLng coord1 = new LatLng(36.879466, 30.667648);
    LatLng coord4 = new LatLng(36.885233, 30.702323);

    // Rectangle
    Rectangle rect = new Rectangle(new LatLngBounds(coord1, coord4));
    rect.setStrokeColor("#d93c3c");
    rect.setFillColor("#d93c3c");
    rect.setFillOpacity(0.5);
    rectangleModel.addOverlay(rect);
  }

  public MapModel getRectangleModel() {
    return rectangleModel;
  }

  public void onRectangleSelect(OverlaySelectEvent event) {
    FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage(FacesMessage.SEVERITY_INFO, "Rectangle Selected", null));
  }
}
