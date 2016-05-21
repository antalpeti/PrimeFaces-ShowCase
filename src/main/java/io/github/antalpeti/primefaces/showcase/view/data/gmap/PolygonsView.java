package io.github.antalpeti.primefaces.showcase.view.data.gmap;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Polygon;

@ManagedBean(name = "gMapPolygonsView")
public class PolygonsView implements Serializable {

  private static final long serialVersionUID = 1L;

  private MapModel polygonModel;

  @PostConstruct
  public void init() {
    polygonModel = new DefaultMapModel();

    // Shared coordinates
    LatLng coord1 = new LatLng(36.879466, 30.667648);
    LatLng coord2 = new LatLng(36.883707, 30.689216);
    LatLng coord3 = new LatLng(36.879703, 30.706707);

    // Polygon
    Polygon polygon = new Polygon();
    polygon.getPaths().add(coord1);
    polygon.getPaths().add(coord2);
    polygon.getPaths().add(coord3);

    polygon.setStrokeColor("#FF9900");
    polygon.setFillColor("#FF9900");
    polygon.setStrokeOpacity(0.7);
    polygon.setFillOpacity(0.7);

    polygonModel.addOverlay(polygon);
  }

  public MapModel getPolygonModel() {
    return polygonModel;
  }

  public void onPolygonSelect(OverlaySelectEvent event) {
    FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage(FacesMessage.SEVERITY_INFO, "Polygon Selected", null));
  }
}
