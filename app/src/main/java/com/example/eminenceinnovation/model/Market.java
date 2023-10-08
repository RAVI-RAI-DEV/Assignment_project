package com.example.eminenceinnovation.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Market {

    @SerializedName("marketId")
    @Expose
    private String marketId;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("runners")
    @Expose
    private List<Runner> runners;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("limit")
    @Expose
    private List<Limit> limit;

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Limit> getLimit() {
        return limit;
    }

    public void setLimit(List<Limit> limit) {
        this.limit = limit;
    }

}