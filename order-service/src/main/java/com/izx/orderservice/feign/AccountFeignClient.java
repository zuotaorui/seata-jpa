package com.izx.orderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "account-service", url = "127.0.0.1:9090")
public interface AccountFeignClient {

    @GetMapping("/debit")
    Boolean debit(@RequestParam("userId") String userId, @RequestParam("money") BigDecimal money);
}
