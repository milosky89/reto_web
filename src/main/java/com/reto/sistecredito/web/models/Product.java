package com.reto.sistecredito.web.models;

public class Product {

    String totalProductPrice;
    String productUnitPrice;
    String productUnitPriceCMD;
    String productName;
    String itemsProducts;

    public Product(){}
    public Product(String totalProductPrice, String productUnitPrice, String productUnitPriceCMD, String productName, String itemsProducts) {
        this.totalProductPrice = totalProductPrice;
        this.productUnitPrice = productUnitPrice;
        this.productUnitPriceCMD = productUnitPriceCMD;
        this.productName = productName;
        this.itemsProducts = itemsProducts;
    }

    public String getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(String totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public String getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(String productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public String getProductUnitPriceCMD() {
        return productUnitPriceCMD;
    }

    public void setProductUnitPriceCMD(String productUnitPriceCMD) {
        this.productUnitPriceCMD = productUnitPriceCMD;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getItemsProducts() {
        return itemsProducts;
    }

    public void setItemsProducts(String itemsProducts) {
        this.itemsProducts = itemsProducts;
    }
}
