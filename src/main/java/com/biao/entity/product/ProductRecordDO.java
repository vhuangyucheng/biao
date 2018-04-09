package com.biao.entity.product;

import java.util.Date;

public class ProductRecordDO {
    private Long productRecordId;

    private Long productSn;

    private String productRecordSn;

    private String productRecordPo;

    private String productMemberId;

    private String productMemberMessage;

    private Integer productTransmission;

    private Date productRecordDate;

    private String productRecordPeople;

    private String productRecordMessage;

    public Long getProductRecordId() {
        return productRecordId;
    }

    public void setProductRecordId(Long productRecordId) {
        this.productRecordId = productRecordId;
    }

    public Long getProductSn() {
        return productSn;
    }

    public void setProductSn(Long productSn) {
        this.productSn = productSn;
    }

    public String getProductRecordSn() {
        return productRecordSn;
    }

    public void setProductRecordSn(String productRecordSn) {
        this.productRecordSn = productRecordSn == null ? null : productRecordSn.trim();
    }

    public String getProductRecordPo() {
        return productRecordPo;
    }

    public void setProductRecordPo(String productRecordPo) {
        this.productRecordPo = productRecordPo == null ? null : productRecordPo.trim();
    }

    public String getProductMemberId() {
        return productMemberId;
    }

    public void setProductMemberId(String productMemberId) {
        this.productMemberId = productMemberId == null ? null : productMemberId.trim();
    }

    public String getProductMemberMessage() {
        return productMemberMessage;
    }

    public void setProductMemberMessage(String productMemberMessage) {
        this.productMemberMessage = productMemberMessage == null ? null : productMemberMessage.trim();
    }

    public Integer getProductTransmission() {
        return productTransmission;
    }

    public void setProductTransmission(Integer productTransmission) {
        this.productTransmission = productTransmission;
    }

    public Date getProductRecordDate() {
        return productRecordDate;
    }

    public void setProductRecordDate(Date productRecordDate) {
        this.productRecordDate = productRecordDate;
    }

    public String getProductRecordPeople() {
        return productRecordPeople;
    }

    public void setProductRecordPeople(String productRecordPeople) {
        this.productRecordPeople = productRecordPeople == null ? null : productRecordPeople.trim();
    }

    public String getProductRecordMessage() {
        return productRecordMessage;
    }

    public void setProductRecordMessage(String productRecordMessage) {
        this.productRecordMessage = productRecordMessage == null ? null : productRecordMessage.trim();
    }
}