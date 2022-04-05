package com.izx.stockservice.repository;

import com.izx.stockservice.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, String> {

    Stock findByCommodityCode(String commodityCode);

}
