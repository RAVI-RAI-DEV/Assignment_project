package com.example.eminenceinnovation.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Runner {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("selectionId")
    @Expose
    private Integer selectionId;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getSelectionId()
    {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId)
    {
        this.selectionId = selectionId;
    }
}