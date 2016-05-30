package io.github.antalpeti.primefaces.showcase.view.data.treetable;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

import io.github.antalpeti.primefaces.showcase.domain.Document;
import io.github.antalpeti.primefaces.showcase.service.DocumentService;

@ManagedBean(name = "treetableBasicView")
@ViewScoped
public class BasicView implements Serializable {

  private static final long serialVersionUID = 1L;

  private TreeNode root;

  private Document selectedDocument;

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

  public Document getSelectedDocument() {
    return selectedDocument;
  }

  public void setSelectedDocument(Document selectedDocument) {
    this.selectedDocument = selectedDocument;
  }
}
