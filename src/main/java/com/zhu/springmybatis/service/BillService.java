package com.zhu.springmybatis.service;

import com.zhu.springmybatis.entity.Bill;

/**
 * @description: UserService
 * @date: 2023/4/22 15:17
 * @author: zdp
 * @version: 1.0
 */
public interface BillService {
    Bill findBillById(int id);
}
