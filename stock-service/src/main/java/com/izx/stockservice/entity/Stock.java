package com.izx.stockservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import lombok.Data;

@Entity
@Table(name = "stock_tbl")
@DynamicUpdate
@DynamicInsert
@Data
public class Stock {

    @Id
    private Long id;
    private String commodityCode;
    private Integer count;
}
