package com.zhu.springmybatis.mapper;

import com.zhu.springmybatis.entity.Bill;

/**
 * @description: BillMapper
 * @date: 2023/4/22 15:08
 * @author: zdp
 * @version: 1.0
 */
public interface BillMapper {
    Bill findBillById(int id);
}
