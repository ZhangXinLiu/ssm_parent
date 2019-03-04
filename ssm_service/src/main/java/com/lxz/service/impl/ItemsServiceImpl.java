package com.lxz.service.impl;

import com.lxz.dao.ItemsMapper;
import com.lxz.pojo.Items;
import com.lxz.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liuxinzhang
 * @create 2019/3/5 - 0:02
 */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items findById(int itemId) {
        return itemsMapper.findById(itemId);
    }
}
