package com.showproject.hospital.pojo;

public class Payment {
    private Integer payId;
    private Integer oId;
    private String payTime;
    private Double payAmount;
    private String payMethod;
    private Integer payState;

    // getter/setter
    public Integer getPayId() { return payId; }
    public void setPayId(Integer payId) { this.payId = payId; }
    public Integer getOId() { return oId; }
    public void setOId(Integer oId) { this.oId = oId; }
    public String getPayTime() { return payTime; }
    public void setPayTime(String payTime) { this.payTime = payTime; }
    public Double getPayAmount() { return payAmount; }
    public void setPayAmount(Double payAmount) { this.payAmount = payAmount; }
    public String getPayMethod() { return payMethod; }
    public void setPayMethod(String payMethod) { this.payMethod = payMethod; }
    public Integer getPayState() { return payState; }
    public void setPayState(Integer payState) { this.payState = payState; }
}
