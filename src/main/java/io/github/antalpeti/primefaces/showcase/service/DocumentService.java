package io.github.antalpeti.primefaces.showcase.service;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.CheckboxTreeNode;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import io.github.antalpeti.primefaces.showcase.domain.Document;

@ManagedBean(name = "documentService")
@ApplicationScoped
public class DocumentService implements Serializable {

  private static final long serialVersionUID = 1L;

  public TreeNode createDocuments() {
    String folder = "Folder";
    TreeNode root = new DefaultTreeNode(new Document("Files", "-", folder), null);

    TreeNode documents = new DefaultTreeNode(new Document("Documents", "-", folder), root);
    TreeNode pictures = new DefaultTreeNode(new Document("Pictures", "-", folder), root);
    TreeNode movies = new DefaultTreeNode(new Document("Movies", "-", folder), root);

    TreeNode work = new DefaultTreeNode(new Document("Work", "-", folder), documents);
    TreeNode primefaces = new DefaultTreeNode(new Document("PrimeFaces", "-", folder), documents);

    // Documents
    String document = "document";
    TreeNode expenses =
        new DefaultTreeNode(document, new Document("Expenses.doc", "30 KB", "Word Document"), work);
    TreeNode resume =
        new DefaultTreeNode(document, new Document("Resume.doc", "10 KB", "Word Document"), work);
    TreeNode refdoc = new DefaultTreeNode(document,
        new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);

    // Pictures
    String picture = "picture";
    TreeNode barca = new DefaultTreeNode(picture,
        new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
    TreeNode primelogo =
        new DefaultTreeNode(picture, new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
    TreeNode optimus = new DefaultTreeNode(picture,
        new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);

    // Movies
    TreeNode pacino = new DefaultTreeNode(new Document("Al Pacino", "-", folder), movies);
    TreeNode deniro = new DefaultTreeNode(new Document("Robert De Niro", "-", folder), movies);

    String movieFile = "Movie File";
    String mp3 = "mp3";
    TreeNode scarface =
        new DefaultTreeNode(mp3, new Document("Scarface", "15 GB", movieFile), pacino);
    TreeNode carlitosWay =
        new DefaultTreeNode(mp3, new Document("Carlitos' Way", "24 GB", movieFile), pacino);

    TreeNode goodfellas =
        new DefaultTreeNode(mp3, new Document("Goodfellas", "23 GB", movieFile), deniro);
    TreeNode untouchables =
        new DefaultTreeNode(mp3, new Document("Untouchables", "17 GB", movieFile), deniro);

    return root;
  }

  public TreeNode createCheckboxDocuments() {
    String folder = "Folder";
    TreeNode root = new CheckboxTreeNode(new Document("Files", "-", folder), null);

    TreeNode documents = new CheckboxTreeNode(new Document("Documents", "-", folder), root);
    TreeNode pictures = new CheckboxTreeNode(new Document("Pictures", "-", folder), root);
    TreeNode movies = new CheckboxTreeNode(new Document("Movies", "-", folder), root);

    TreeNode work = new CheckboxTreeNode(new Document("Work", "-", folder), documents);
    TreeNode primefaces = new CheckboxTreeNode(new Document("PrimeFaces", "-", folder), documents);

    // Documents
    String document = "document";
    TreeNode expenses = new CheckboxTreeNode(document,
        new Document("Expenses.doc", "30 KB", "Word Document"), work);
    TreeNode resume =
        new CheckboxTreeNode(document, new Document("Resume.doc", "10 KB", "Word Document"), work);
    TreeNode refdoc = new CheckboxTreeNode(document,
        new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);

    // Pictures
    String picture = "picture";
    TreeNode barca = new CheckboxTreeNode(picture,
        new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
    TreeNode primelogo =
        new CheckboxTreeNode(picture, new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
    TreeNode optimus = new CheckboxTreeNode(picture,
        new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);

    // Movies
    TreeNode pacino = new CheckboxTreeNode(new Document("Al Pacino", "-", folder), movies);
    TreeNode deniro = new CheckboxTreeNode(new Document("Robert De Niro", "-", folder), movies);

    String movieFile = "Movie File";
    TreeNode scarface =
        new CheckboxTreeNode("mp3", new Document("Scarface", "15 GB", movieFile), pacino);
    TreeNode carlitosWay =
        new CheckboxTreeNode("mp3", new Document("Carlitos' Way", "24 GB", movieFile), pacino);

    TreeNode goodfellas =
        new CheckboxTreeNode("mp3", new Document("Goodfellas", "23 GB", movieFile), deniro);
    TreeNode untouchables =
        new CheckboxTreeNode("mp3", new Document("Untouchables", "17 GB", movieFile), deniro);

    return root;
  }
}
