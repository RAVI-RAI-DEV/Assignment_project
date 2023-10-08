package com.example.eminenceinnovation.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("marketIds")
    @Expose
    private List<String> marketIds;
    @SerializedName("markets")
    @Expose
    private List<Market> markets;
    @SerializedName("mEventId")
    @Expose
    private String mEventId;
    @SerializedName("matchRunners")
    @Expose
    private List<MatchRunner> matchRunners;
    @SerializedName("bmProvider")
    @Expose
    private String bmProvider;
    @SerializedName("fancyAType")
    @Expose
    private String fancyAType;
    @SerializedName("bbbFancy")
    @Expose
    private String bbbFancy;
    @SerializedName("addType")
    @Expose
    private String addType;
    @SerializedName("channelNo")
    @Expose
    private String channelNo;
    @SerializedName("mType")
    @Expose
    private String mType;
    @SerializedName("eventId")
    @Expose
    private String eventId;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("marketId")
    @Expose
    private String marketId;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("competitionId")
    @Expose
    private String competitionId;
    @SerializedName("competitionName")
    @Expose
    private String competitionName;
    @SerializedName("sportId")
    @Expose
    private String sportId;
    @SerializedName("sportName")
    @Expose
    private String sportName;
    @SerializedName("oddsProvider")
    @Expose
    private String oddsProvider;
    @SerializedName("fancyProvider")
    @Expose
    private String fancyProvider;
    @SerializedName("openDate")
    @Expose
    private String openDate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("isResult")
    @Expose
    private Boolean isResult;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("unixDate")
    @Expose
    private Integer unixDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getMarketIds() {
        return marketIds;
    }

    public void setMarketIds(List<String> marketIds) {
        this.marketIds = marketIds;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public String getmEventId() {
        return mEventId;
    }

    public void setmEventId(String mEventId) {
        this.mEventId = mEventId;
    }

    public List<MatchRunner> getMatchRunners() {
        return matchRunners;
    }

    public void setMatchRunners(List<MatchRunner> matchRunners) {
        this.matchRunners = matchRunners;
    }

    public String getBmProvider() {
        return bmProvider;
    }

    public void setBmProvider(String bmProvider) {
        this.bmProvider = bmProvider;
    }

    public String getFancyAType() {
        return fancyAType;
    }

    public void setFancyAType(String fancyAType) {
        this.fancyAType = fancyAType;
    }

    public String getBbbFancy() {
        return bbbFancy;
    }

    public void setBbbFancy(String bbbFancy) {
        this.bbbFancy = bbbFancy;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

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

    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getOddsProvider() {
        return oddsProvider;
    }

    public void setOddsProvider(String oddsProvider) {
        this.oddsProvider = oddsProvider;
    }

    public String getFancyProvider() {
        return fancyProvider;
    }

    public void setFancyProvider(String fancyProvider) {
        this.fancyProvider = fancyProvider;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsResult() {
        return isResult;
    }

    public void setIsResult(Boolean isResult) {
        this.isResult = isResult;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUnixDate() {
        return unixDate;
    }

    public void setUnixDate(Integer unixDate) {
        this.unixDate = unixDate;
    }

}
