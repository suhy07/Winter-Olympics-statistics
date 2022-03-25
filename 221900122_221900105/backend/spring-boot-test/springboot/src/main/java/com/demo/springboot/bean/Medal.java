package com.demo.springboot.bean;

public class Medal {
    public String getBronze() {
        return bronze;
    }

    public void setBronze(String bronze) {
        this.bronze = bronze;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    private String bronze;
    private String count;
    private String countryid;
    private String countryname;
    private String gold;
    private String rank;
    private String silver;
}
