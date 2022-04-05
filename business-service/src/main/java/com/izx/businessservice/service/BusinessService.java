package com.izx.businessservice.service;

import com.izx.businessservice.feign.OrderFeignClient;
import com.izx.businessservice.feign.StockFeignClient;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Autowired
    private StockFeignClient stockFeignClient;
    @Autowired
    private OrderFeignClient orderFeignClient;

    /**
     * 减库存，下订单
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     */
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        stockFeignClient.deduct(commodityCode, orderCount);

        orderFeignClient.create(userId, commodityCode, orderCount);
    }
}
