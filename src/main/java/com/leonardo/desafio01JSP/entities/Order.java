package com.leonardo.desafio01JSP.entities;

import java.util.Objects;

public class Order {
    private Integer code;
    private Double basic;
    private Integer discount;

    public Order(){}

    public Order(Integer code, Double basic, Integer discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(code, order.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
