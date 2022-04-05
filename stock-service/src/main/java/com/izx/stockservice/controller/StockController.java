package com.izx.stockservice.controller;

import com.izx.stockservice.entity.Stock;
import com.izx.stockservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping(path = "/deduct")
    public Boolean deduct(String commodityCode, Integer count) {
        stockService.deduct(commodityCode, count);
        return true;
    }

    @GetMapping
    public List<Stock> findAll() {
        return stockService.findAll();
    }
}
