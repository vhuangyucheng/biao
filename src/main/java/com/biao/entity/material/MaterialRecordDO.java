package com.biao.entity.material;

import java.util.Date;

public class MaterialRecordDO {
    private Long materialRecordId;

    private Long productId;

    private String productRecordSn;

    private Long materialId;

    private Integer materialRecordTransmission;

    private Double materialRecordConvert;

    private String materialRecordMember;

    private String materialRecordMessage;

    private Date materialRecordDate;

    private String materialRecordDepartment;

    public Long getMaterialRecordId() {
        return materialRecordId;
    }

    public void setMaterialRecordId(Long materialRecordId) {
        this.materialRecordId = materialRecordId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductRecordSn() {
        return productRecordSn;
    }

    public void setProductRecordSn(String productRecordSn) {
        this.productRecordSn = productRecordSn == null ? null : productRecordSn.trim();
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Integer getMaterialRecordTransmission() {
        return materialRecordTransmission;
    }

    public void setMaterialRecordTransmission(Integer materialRecordTransmission) {
        this.materialRecordTransmission = materialRecordTransmission;
    }

    public Double getMaterialRecordConvert() {
        return materialRecordConvert;
    }

    public void setMaterialRecordConvert(Double materialRecordConvert) {
        this.materialRecordConvert = materialRecordConvert;
    }

    public String getMaterialRecordMember() {
        return materialRecordMember;
    }

    public void setMaterialRecordMember(String materialRecordMember) {
        this.materialRecordMember = materialRecordMember == null ? null : materialRecordMember.trim();
    }

    public String getMaterialRecordMessage() {
        return materialRecordMessage;
    }

    public void setMaterialRecordMessage(String materialRecordMessage) {
        this.materialRecordMessage = materialRecordMessage == null ? null : materialRecordMessage.trim();
    }

    public Date getMaterialRecordDate() {
        return materialRecordDate;
    }

    public void setMaterialRecordDate(Date materialRecordDate) {
        this.materialRecordDate = materialRecordDate;
    }

    public String getMaterialRecordDepartment() {
        return materialRecordDepartment;
    }

    public void setMaterialRecordDepartment(String materialRecordDepartment) {
        this.materialRecordDepartment = materialRecordDepartment == null ? null : materialRecordDepartment.trim();
    }
}