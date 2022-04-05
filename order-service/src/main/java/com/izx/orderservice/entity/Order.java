package com.izx.orderservice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_tbl")
@DynamicUpdate
@DynamicInsert
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "commodity_code")
    private String commodityCode;

    @Column(name = "money")
    private BigDecimal money;

    @Column(name = "count")
    private Integer count;

    public Order() {
    }

    public Order(String userId, String commodityCode, BigDecimal money, Integer count) {
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.money = money;
        this.count = count;
    }
}
