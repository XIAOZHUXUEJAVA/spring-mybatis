package com.zhu.springmybatis;

import com.zhu.springmybatis.service.BillService;
import com.zhu.springmybatis.service.impl.BillServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: BillTest
 * @date: 2023/4/22 15:20
 * @author: zdp
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BillTest {

    @Autowired
    private BillService billService;

    @Test
    public void testFindBillById() {
        System.out.println(billService.findBillById(1));
    }
}
