package io.github.antalpeti.primefaces.showcase.view.charts;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.BubbleChartSeries;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean(name = "chartsChartView")
public class ChartView implements Serializable {

  private static final long serialVersionUID = 1L;

  private LineChartModel areaModel;

  @PostConstruct
  public void init() {
    createAreaModel();
    createBubbleModels();
  }

  public LineChartModel getAreaModel() {
    return areaModel;
  }

  private void createAreaModel() {
    areaModel = new LineChartModel();

    LineChartSeries boys = new LineChartSeries();
    boys.setFill(true);
    boys.setLabel("Boys");
    boys.set("2004", 120);
    boys.set("2005", 100);
    boys.set("2006", 44);
    boys.set("2007", 150);
    boys.set("2008", 25);

    LineChartSeries girls = new LineChartSeries();
    girls.setFill(true);
    girls.setLabel("Girls");
    girls.set("2004", 52);
    girls.set("2005", 60);
    girls.set("2006", 110);
    girls.set("2007", 90);
    girls.set("2008", 120);

    areaModel.addSeries(boys);
    areaModel.addSeries(girls);

    areaModel.setTitle("Area Chart");
    areaModel.setLegendPosition("ne");
    areaModel.setStacked(true);
    areaModel.setShowPointLabels(true);

    Axis xAxis = new CategoryAxis("Years");
    areaModel.getAxes().put(AxisType.X, xAxis);
    Axis yAxis = areaModel.getAxis(AxisType.Y);
    yAxis.setLabel("Births");
    yAxis.setMin(0);
    yAxis.setMax(300);
  }

  private BubbleChartModel bubbleModel1;
  private BubbleChartModel bubbleModel2;


  public BubbleChartModel getBubbleModel1() {
    return bubbleModel1;
  }

  public BubbleChartModel getBubbleModel2() {
    return bubbleModel2;
  }

  private void createBubbleModels() {
    bubbleModel1 = initBubbleModel();
    bubbleModel1.setTitle("Bubble Chart");
    bubbleModel1.getAxis(AxisType.X).setLabel("Price");
    Axis yAxis = bubbleModel1.getAxis(AxisType.Y);
    yAxis.setMin(0);
    yAxis.setMax(250);
    yAxis.setLabel("Labels");

    bubbleModel2 = initBubbleModel();
    bubbleModel2.setTitle("Custom Options");
    bubbleModel2.setShadow(false);
    bubbleModel2.setBubbleGradients(true);
    bubbleModel2.setBubbleAlpha(0.8);
    bubbleModel2.getAxis(AxisType.X).setTickAngle(-50);
    yAxis = bubbleModel2.getAxis(AxisType.Y);
    yAxis.setMin(0);
    yAxis.setMax(250);
    yAxis.setTickAngle(50);
  }

  private BubbleChartModel initBubbleModel() {
    BubbleChartModel model = new BubbleChartModel();

    model.add(new BubbleChartSeries("Acura", 70, 183, 55));
    model.add(new BubbleChartSeries("Alfa Romeo", 45, 92, 36));
    model.add(new BubbleChartSeries("AM General", 24, 104, 40));
    model.add(new BubbleChartSeries("Bugatti", 50, 123, 60));
    model.add(new BubbleChartSeries("BMW", 15, 89, 25));
    model.add(new BubbleChartSeries("Audi", 40, 180, 80));
    model.add(new BubbleChartSeries("Aston Martin", 70, 70, 48));

    return model;
  }

}
