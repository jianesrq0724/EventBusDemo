package com.carl.mvpdemo.module.home.bean;

import java.io.Serializable;

public class SelectSiteBean implements Serializable {

    /**
     * siteId : 2
     * siteName : Feelunique
     * shortTitle : 欧洲最大的美妆电商
     * logo : https://cdn.azoyaclub.com/FoQZOD8jKX4NSLbIipSy2KFJVbjL
     * storeId : 12
     */

    private int siteId;
    private String siteName;
    private String shortTitle;
    private String logo;
    private int storeId;
    private String nationalFlag;

    public SelectSiteBean() {
    }

    public SelectSiteBean(int siteId, String siteName, int storeId, String nationalFlag) {
        this.siteId = siteId;
        this.siteName = siteName;
        this.storeId = storeId;
        this.nationalFlag = nationalFlag;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getNationalFlag() {
        return nationalFlag;
    }

    public void setNationalFlag(String nationalFlag) {
        this.nationalFlag = nationalFlag;
    }
}
