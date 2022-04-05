package com.izx.accountservice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "account_tbl")
@DynamicUpdate
@DynamicInsert
@Data
public class Account {

    @Id
    private Long id;
    private String userId;
    private BigDecimal money;
}
