package io.github.antalpeti.primefaces.showcase.view.button;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "buttonProductDetailView")
public class ProductDetailView {

  private String productId;

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }
}
