package com.lxz.dao;

import com.lxz.pojo.Items;

/**
 * @author liuxinzhang
 * @create 2019/3/4 - 23:32
 */
public interface ItemsMapper {
    Items findById(int id);
}
