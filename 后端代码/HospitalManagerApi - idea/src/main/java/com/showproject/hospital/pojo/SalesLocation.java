package com.showproject.hospital.pojo;

public class SalesLocation {
    private Integer locationId;
    private String locationName;
    private String address;
    private Integer cityId;
    private Double longitude;
    private Double latitude;
    private String cityName;
    public String getCityName() { return cityName; }
    public void setCityName(String cityName) { this.cityName = cityName; }
    // Getter and Setter
    public Integer getLocationId() { return locationId; }
    public void setLocationId(Integer locationId) { this.locationId = locationId; }
    public String getLocationName() { return locationName; }
    public void setLocationName(String locationName) { this.locationName = locationName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public Integer getCityId() { return cityId; }
    public void setCityId(Integer cityId) { this.cityId = cityId; }
    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
}