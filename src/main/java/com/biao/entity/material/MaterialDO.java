package com.biao.entity.material;

public class MaterialDO {
    private Long materialId;

    private String materialName;

    private String materialCode;

    private String materialCount;

    private String materialMessage;

    private Integer meterialQuantity;

    private Double meterialUnitWeight;

    private String meterialLocation;

    private Double meterialPrice;

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getMaterialCount() {
        return materialCount;
    }

    public void setMaterialCount(String materialCount) {
        this.materialCount = materialCount == null ? null : materialCount.trim();
    }

    public String getMaterialMessage() {
        return materialMessage;
    }

    public void setMaterialMessage(String materialMessage) {
        this.materialMessage = materialMessage == null ? null : materialMessage.trim();
    }

    public Integer getMeterialQuantity() {
        return meterialQuantity;
    }

    public void setMeterialQuantity(Integer meterialQuantity) {
        this.meterialQuantity = meterialQuantity;
    }

    public Double getMeterialUnitWeight() {
        return meterialUnitWeight;
    }

    public void setMeterialUnitWeight(Double meterialUnitWeight) {
        this.meterialUnitWeight = meterialUnitWeight;
    }

    public String getMeterialLocation() {
        return meterialLocation;
    }

    public void setMeterialLocation(String meterialLocation) {
        this.meterialLocation = meterialLocation == null ? null : meterialLocation.trim();
    }

    public Double getMeterialPrice() {
        return meterialPrice;
    }

    public void setMeterialPrice(Double meterialPrice) {
        this.meterialPrice = meterialPrice;
    }
}