package com.zhu.springmybatis.service.impl;

import com.zhu.springmybatis.entity.Bill;
import com.zhu.springmybatis.mapper.BillMapper;
import com.zhu.springmybatis.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: BillServiceImpl
 * @date: 2023/4/22 15:18
 * @author: zdp
 * @version: 1.0
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;
    @Override
    public Bill findBillById(int id) {
        return billMapper.findBillById(id);
    }
}
