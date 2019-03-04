package com.lxz.service;


import com.lxz.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuxinzhang
 * @create 2019/3/5 - 3:27
 */
public class ItemsServiceTest {

    @Test
    public void testFindItemsById() {
        //获取 spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
        //获取 Service
        ItemsService itemsService = applicationContext.getBean(ItemsService.class);
        //调用 Service 方法
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
