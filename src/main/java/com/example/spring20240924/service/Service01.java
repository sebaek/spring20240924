package com.example.spring20240924.service;


import com.example.spring20240924.mapper.Mapper09;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Service01 {
    private final Mapper09 mapper09;

    @Transactional
    public void transferMoney(Integer money) {
        mapper09.updateMoney1(money);
        mapper09.updateMoney2(money);
    }
}
