package com.management.product.model.dto;

public class ProductDTO {

    // * 주석을 지우고 제품 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, ProductDTO productCompany DB의 'PRODUCT_INFO' 테이블과 매핑 가능해야 합니다.
    // * DTO 객체에 대하여 기본적으로 작성해야 하는 사항을 반드시 작성하세요.
    private String productCode;
    private String productName;
    private String orignCost;
    private String releaseDate;
    private String discountRate;
    private String salesQuantity;
    private String stockQuantity;
    private String categoryCode;
    private String productIonStatus;

    public ProductDTO() {
    }

    public ProductDTO(String productCode, String productName, String orignCost, String releaseDate, String discountRate, String salesQuantity, String stockQuantity, String categoryCode, String productIonStatus) {
        this.productCode = productCode;
        this.productName = productName;
        this.orignCost = orignCost;
        this.releaseDate = releaseDate;
        this.discountRate = discountRate;
        this.salesQuantity = salesQuantity;
        this.stockQuantity = stockQuantity;
        this.categoryCode = categoryCode;
        this.productIonStatus = productIonStatus;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrignCost() {
        return orignCost;
    }

    public void setOrignCost(String orignCost) {
        this.orignCost = orignCost;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProductIonStatus() {
        return productIonStatus;
    }

    public void setProductIonStatus(String productIonStatus) {
        this.productIonStatus = productIonStatus;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", orignCost='" + orignCost + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", discountRate='" + discountRate + '\'' +
                ", salesQuantity='" + salesQuantity + '\'' +
                ", stockQuantity='" + stockQuantity + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", productIonStatus='" + productIonStatus + '\'' +
                '}';
    }
}


