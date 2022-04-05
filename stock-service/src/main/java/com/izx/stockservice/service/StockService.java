package com.izx.stockservice.service;

import com.izx.stockservice.entity.Stock;
import com.izx.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockDAO;

    @Transactional
    public void deduct(String commodityCode, int count) {
        Stock stock = stockDAO.findByCommodityCode(commodityCode);
        stock.setCount(stock.getCount() - count);

        stockDAO.save(stock);
    }

    public List<Stock> findAll(){
        return stockDAO.findAll();
    }
}
