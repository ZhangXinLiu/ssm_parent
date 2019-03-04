package com.lxz.web.controller;

import com.lxz.pojo.Items;
import com.lxz.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuxinzhang
 * @create 2019/3/5 - 0:05
 */
@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    // 展示商品信息页面
    @RequestMapping("showItem")
    public String showItem(int id, Model model) {
        Items items = itemsService.findById(id);
        model.addAttribute("item", items);
        return "viewItem";
    }
}
