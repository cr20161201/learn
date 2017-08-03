package com.soecode.wxx.service.impl;

import com.soecode.wxx.dto.ItemsQueryVo;
import com.soecode.wxx.mapper.BaseTest;
import com.soecode.wxx.mapper.ItemsMapper;
import com.soecode.wxx.mapper.ItemsMapperCustom;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ItemsServiceImplTest extends BaseTest {

    //注入mapper
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    public void findItemsList() throws Exception {
        ItemsQueryVo itemsQueryVo = null;
        itemsMapperCustom.findItemsList(itemsQueryVo);
    }

    @Test
    public void findItemsById() throws Exception {
    }

    @Test
    public void updateItems() throws Exception {
    }

}