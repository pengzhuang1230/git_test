package com.heima.service.impl;

import com.heima.dao.ItemsDao;
import com.heima.domain.Items;
import com.heima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }

    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        itemsDao.delete(id);
    }
}
