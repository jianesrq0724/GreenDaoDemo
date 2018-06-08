package com.carl.mvpdemo.util.sql.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/8
 */
@Entity
public class BaseInfo {
    @Id
    private Long id;

    @NotNull
    private String mobileNum;

    private String addressStreet;

    @Generated(hash = 1762143180)
    public BaseInfo(Long id, @NotNull String mobileNum, String addressStreet) {
        this.id = id;
        this.mobileNum = mobileNum;
        this.addressStreet = addressStreet;
    }

    @Generated(hash = 1463957903)
    public BaseInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNum() {
        return this.mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getAddressStreet() {
        return this.addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }
}
