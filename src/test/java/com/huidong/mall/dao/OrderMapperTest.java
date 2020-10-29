package com.huidong.mall.dao;

import com.huidong.mall.MallApplicationTests;
import com.huidong.mall.pojo.Order;
import com.huidong.mall.pojo.OrderItem;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Desc:
 */
public class OrderMapperTest extends MallApplicationTests {


    @Autowired
    public OrderMapper orderMapper;

    public void testDeleteByPrimaryKey() {
    }

    public void testInsert() {
    }

    public void testInsertSelective() {
    }

    @Test
    public void SelectByPrimaryKey() {
        Order order = orderMapper.selectByPrimaryKey(1);
        System.out.println(order);
    }

    public void testUpdateByPrimaryKeySelective() {
    }

    public void testUpdateByPrimaryKey() {
    }
}