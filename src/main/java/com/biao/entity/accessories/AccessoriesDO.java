package com.biao.entity.accessories;

public class AccessoriesDO {
    private Long accessoriesId;

    private String accessoriesSpecification;

    private Integer accessoriesQuantityPcs;

    private Integer accessoriesQuantityReal;

    private String accessoriesUnit;

    private String accessoriesMessage;

    private String accessoriesLocation;

    private String accessoriesHeadTrail;

    private String accessoriesThickness;

    private String accessoriesM;

    private String accessoriesQ;

    private Double accessoriesGrooveWidth;

    private Long accessoriesPrice;

    public Long getAccessoriesId() {
        return accessoriesId;
    }

    public void setAccessoriesId(Long accessoriesId) {
        this.accessoriesId = accessoriesId;
    }

    public String getAccessoriesSpecification() {
        return accessoriesSpecification;
    }

    public void setAccessoriesSpecification(String accessoriesSpecification) {
        this.accessoriesSpecification = accessoriesSpecification == null ? null : accessoriesSpecification.trim();
    }

    public Integer getAccessoriesQuantityPcs() {
        return accessoriesQuantityPcs;
    }

    public void setAccessoriesQuantityPcs(Integer accessoriesQuantityPcs) {
        this.accessoriesQuantityPcs = accessoriesQuantityPcs;
    }

    public Integer getAccessoriesQuantityReal() {
        return accessoriesQuantityReal;
    }

    public void setAccessoriesQuantityReal(Integer accessoriesQuantityReal) {
        this.accessoriesQuantityReal = accessoriesQuantityReal;
    }

    public String getAccessoriesUnit() {
        return accessoriesUnit;
    }

    public void setAccessoriesUnit(String accessoriesUnit) {
        this.accessoriesUnit = accessoriesUnit == null ? null : accessoriesUnit.trim();
    }

    public String getAccessoriesMessage() {
        return accessoriesMessage;
    }

    public void setAccessoriesMessage(String accessoriesMessage) {
        this.accessoriesMessage = accessoriesMessage == null ? null : accessoriesMessage.trim();
    }

    public String getAccessoriesLocation() {
        return accessoriesLocation;
    }

    public void setAccessoriesLocation(String accessoriesLocation) {
        this.accessoriesLocation = accessoriesLocation == null ? null : accessoriesLocation.trim();
    }

    public String getAccessoriesHeadTrail() {
        return accessoriesHeadTrail;
    }

    public void setAccessoriesHeadTrail(String accessoriesHeadTrail) {
        this.accessoriesHeadTrail = accessoriesHeadTrail == null ? null : accessoriesHeadTrail.trim();
    }

    public String getAccessoriesThickness() {
        return accessoriesThickness;
    }

    public void setAccessoriesThickness(String accessoriesThickness) {
        this.accessoriesThickness = accessoriesThickness == null ? null : accessoriesThickness.trim();
    }

    public String getAccessoriesM() {
        return accessoriesM;
    }

    public void setAccessoriesM(String accessoriesM) {
        this.accessoriesM = accessoriesM == null ? null : accessoriesM.trim();
    }

    public String getAccessoriesQ() {
        return accessoriesQ;
    }

    public void setAccessoriesQ(String accessoriesQ) {
        this.accessoriesQ = accessoriesQ == null ? null : accessoriesQ.trim();
    }

    public Double getAccessoriesGrooveWidth() {
        return accessoriesGrooveWidth;
    }

    public void setAccessoriesGrooveWidth(Double accessoriesGrooveWidth) {
        this.accessoriesGrooveWidth = accessoriesGrooveWidth;
    }

    public Long getAccessoriesPrice() {
        return accessoriesPrice;
    }

    public void setAccessoriesPrice(Long accessoriesPrice) {
        this.accessoriesPrice = accessoriesPrice;
    }
}