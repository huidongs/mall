package com.huidong.mall;

import com.huidong.mall.dao.CategoryMapper;
import com.huidong.mall.dao.OrderMapper;
import com.huidong.mall.pojo.Category;
import com.huidong.mall.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Test
    public void contextLoads() {
        Category id = categoryMapper.findById(100001);
        System.out.println("==============="+id);
    }
    @Test
    public void test() {
        Order order = orderMapper.selectByPrimaryKey(1);
        System.out.println("==============="+order.toString());
    }

}
