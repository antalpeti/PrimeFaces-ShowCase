package io.github.antalpeti.primefaces.showcase.view.data.treetable;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

import io.github.antalpeti.primefaces.showcase.service.DocumentService;

@ManagedBean(name = "tabletreeScrollableView")
@ViewScoped
public class ScrollableView implements Serializable {

  private static final long serialVersionUID = 1L;

  private TreeNode root1;
  private TreeNode root2;
  private TreeNode root3;

  @ManagedProperty("#{documentService}")
  private DocumentService service;

  @PostConstruct
  public void init() {
    root1 = service.createDocuments();
    root2 = service.createDocuments();
    root3 = service.createDocuments();

    root1.getChildren().get(0).setExpanded(true);
    root1.getChildren().get(1).setExpanded(true);

    root3.getChildren().get(0).setExpanded(true);
    root3.getChildren().get(1).setExpanded(true);
  }

  public TreeNode getRoot1() {
    return root1;
  }

  public TreeNode getRoot2() {
    return root2;
  }

  public TreeNode getRoot3() {
    return root3;
  }

  public void setService(DocumentService service) {
    this.service = service;
  }
}
