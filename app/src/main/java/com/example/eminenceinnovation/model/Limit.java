package com.example.eminenceinnovation.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Limit {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("baseCurrency")
    @Expose
    private Boolean baseCurrency;
    @SerializedName("preMinStake")
    @Expose
    private Integer preMinStake;
    @SerializedName("preMaxStake")
    @Expose
    private Integer preMaxStake;
    @SerializedName("preMaxPL")
    @Expose
    private Integer preMaxPL;
    @SerializedName("minStake")
    @Expose
    private Integer minStake;
    @SerializedName("maxStake")
    @Expose
    private Integer maxStake;
    @SerializedName("maxPL")
    @Expose
    private Integer maxPL;
    @SerializedName("delay")
    @Expose
    private Integer delay;
    @SerializedName("oddsLimit")
    @Expose
    private Integer oddsLimit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(Boolean baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Integer getPreMinStake() {
        return preMinStake;
    }

    public void setPreMinStake(Integer preMinStake) {
        this.preMinStake = preMinStake;
    }

    public Integer getPreMaxStake() {
        return preMaxStake;
    }

    public void setPreMaxStake(Integer preMaxStake) {
        this.preMaxStake = preMaxStake;
    }

    public Integer getPreMaxPL() {
        return preMaxPL;
    }

    public void setPreMaxPL(Integer preMaxPL) {
        this.preMaxPL = preMaxPL;
    }

    public Integer getMinStake() {
        return minStake;
    }

    public void setMinStake(Integer minStake) {
        this.minStake = minStake;
    }

    public Integer getMaxStake() {
        return maxStake;
    }

    public void setMaxStake(Integer maxStake) {
        this.maxStake = maxStake;
    }

    public Integer getMaxPL() {
        return maxPL;
    }

    public void setMaxPL(Integer maxPL) {
        this.maxPL = maxPL;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Integer getOddsLimit() {
        return oddsLimit;
    }

    public void setOddsLimit(Integer oddsLimit) {
        this.oddsLimit = oddsLimit;
    }

}