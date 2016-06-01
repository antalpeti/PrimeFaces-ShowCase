package io.github.antalpeti.primefaces.showcase.view.data.treetable;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

import io.github.antalpeti.primefaces.showcase.service.DocumentService;

@ManagedBean(name = "treetableContextMenuView")
@ViewScoped
public class ContextMenuView implements Serializable {

  private static final long serialVersionUID = 1L;

  private TreeNode root;

  private TreeNode selectedNode;

  @ManagedProperty("#{documentService}")
  private DocumentService service;

  @PostConstruct
  public void init() {
    root = service.createDocuments();
  }

  public TreeNode getRoot() {
    return root;
  }

  public void setService(DocumentService service) {
    this.service = service;
  }

  public TreeNode getSelectedNode() {
    return selectedNode;
  }

  public void setSelectedNode(TreeNode selectedNode) {
    this.selectedNode = selectedNode;
  }

  public void deleteNode() {
    selectedNode.getChildren().clear();
    selectedNode.getParent().getChildren().remove(selectedNode);
    selectedNode.setParent(null);

    selectedNode = null;
  }
}
