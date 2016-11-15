package com.crakama.refugee.database;

/**
 * Created by crakama on 11/15/2016.
 */

public class TownsModel {
    public TownsModel() {

    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(String schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public String getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(String hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    private String townName;
    private String schoolInfo;

    public TownsModel(String townName, String schoolInfo, String hospitalInfo) {
        this.townName = townName;
        this.schoolInfo = schoolInfo;
        this.hospitalInfo = hospitalInfo;
        //this.otherInfo = otherInfo;
    }

    private String hospitalInfo;
    private String otherInfo;
}
