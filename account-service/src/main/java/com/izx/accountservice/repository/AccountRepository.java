package com.izx.accountservice.repository;

import com.izx.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByUserId(String userId);

}
