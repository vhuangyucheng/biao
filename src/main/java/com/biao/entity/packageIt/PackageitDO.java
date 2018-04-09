package com.biao.entity.packageIt;

public class PackageitDO {
    private Long packageId;

    private Long productRecordId;

    private Integer packageStatus;

    private Integer packageQuantity;

    private Integer packageReady;

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public Long getProductRecordId() {
        return productRecordId;
    }

    public void setProductRecordId(Long productRecordId) {
        this.productRecordId = productRecordId;
    }

    public Integer getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(Integer packageStatus) {
        this.packageStatus = packageStatus;
    }

    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public Integer getPackageReady() {
        return packageReady;
    }

    public void setPackageReady(Integer packageReady) {
        this.packageReady = packageReady;
    }
}