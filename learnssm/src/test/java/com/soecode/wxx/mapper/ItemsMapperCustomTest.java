package com.soecode.wxx.mapper;

import com.soecode.wxx.dto.ItemsCustom;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ItemsMapperCustomTest extends BaseTest {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Test
    public void findItemsList() throws Exception {
        List<ItemsCustom> lists = itemsMapperCustom.findItemsList(null);
        System.out.println(lists.size());
    }

}