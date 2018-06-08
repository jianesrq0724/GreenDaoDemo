package com.carl.mvpdemo.util.sql.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/8
 */
@Entity
public class OrderInfo {
    @Id
    private Long id;

    private String orderId = "";

    private String orderCode = "";

    @Generated(hash = 2204174)
    public OrderInfo(Long id, String orderId, String orderCode) {
        this.id = id;
        this.orderId = orderId;
        this.orderCode = orderCode;
    }

    @Generated(hash = 1695813404)
    public OrderInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

 

}
