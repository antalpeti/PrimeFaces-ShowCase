package io.github.antalpeti.primefaces.showcase.view.data.treetable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

import io.github.antalpeti.primefaces.showcase.service.DocumentService;

@ManagedBean(name = "treetableColumnsView")
@ViewScoped
public class ColumnsView implements Serializable {

  private static final long serialVersionUID = 1L;

  private final static List<String> VALID_COLUMN_KEYS = Arrays.asList("name", "size", "type");

  private String columnTemplate = "name size type";

  private List<ColumnModel> columns;

  private TreeNode root;

  @ManagedProperty("#{documentService}")
  private DocumentService service;

  @PostConstruct
  public void init() {
    root = service.createDocuments();

    createDynamicColumns();
  }

  public TreeNode getRoot() {
    return root;
  }

  public void setService(DocumentService service) {
    this.service = service;
  }

  public void createDynamicColumns() {
    String[] columnKeys = columnTemplate.split(" ");
    columns = new ArrayList<ColumnModel>();

    for (String columnKey : columnKeys) {
      String key = columnKey.trim();

      if (VALID_COLUMN_KEYS.contains(key)) {
        columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
      }
    }
  }

  public String getColumnTemplate() {
    return columnTemplate;
  }

  public void setColumnTemplate(String columnTemplate) {
    this.columnTemplate = columnTemplate;
  }

  public List<ColumnModel> getColumns() {
    return columns;
  }

  static public class ColumnModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String header;
    private String property;

    public ColumnModel(String header, String property) {
      this.header = header;
      this.property = property;
    }

    public String getHeader() {
      return header;
    }

    public String getProperty() {
      return property;
    }
  }
}
