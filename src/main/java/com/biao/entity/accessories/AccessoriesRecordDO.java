package com.biao.entity.accessories;

import java.util.Date;

public class AccessoriesRecordDO {
    private Long accessoriesRecordId;

    private Long accessoriesId;

    private String productRecordSn;

    private Long productId;

    private Integer accessoriesTransmission;

    private Double accessoriesRecordConvert;

    private String accessoriesRecordMember;

    private String accessoriesRecordMessage;

    private Date accessoriesRecordDate;

    public Long getAccessoriesRecordId() {
        return accessoriesRecordId;
    }

    public void setAccessoriesRecordId(Long accessoriesRecordId) {
        this.accessoriesRecordId = accessoriesRecordId;
    }

    public Long getAccessoriesId() {
        return accessoriesId;
    }

    public void setAccessoriesId(Long accessoriesId) {
        this.accessoriesId = accessoriesId;
    }

    public String getProductRecordSn() {
        return productRecordSn;
    }

    public void setProductRecordSn(String productRecordSn) {
        this.productRecordSn = productRecordSn == null ? null : productRecordSn.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getAccessoriesTransmission() {
        return accessoriesTransmission;
    }

    public void setAccessoriesTransmission(Integer accessoriesTransmission) {
        this.accessoriesTransmission = accessoriesTransmission;
    }

    public Double getAccessoriesRecordConvert() {
        return accessoriesRecordConvert;
    }

    public void setAccessoriesRecordConvert(Double accessoriesRecordConvert) {
        this.accessoriesRecordConvert = accessoriesRecordConvert;
    }

    public String getAccessoriesRecordMember() {
        return accessoriesRecordMember;
    }

    public void setAccessoriesRecordMember(String accessoriesRecordMember) {
        this.accessoriesRecordMember = accessoriesRecordMember == null ? null : accessoriesRecordMember.trim();
    }

    public String getAccessoriesRecordMessage() {
        return accessoriesRecordMessage;
    }

    public void setAccessoriesRecordMessage(String accessoriesRecordMessage) {
        this.accessoriesRecordMessage = accessoriesRecordMessage == null ? null : accessoriesRecordMessage.trim();
    }

    public Date getAccessoriesRecordDate() {
        return accessoriesRecordDate;
    }

    public void setAccessoriesRecordDate(Date accessoriesRecordDate) {
        this.accessoriesRecordDate = accessoriesRecordDate;
    }
}