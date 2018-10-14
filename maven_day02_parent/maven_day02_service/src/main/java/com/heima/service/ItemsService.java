package com.heima.service;

import com.heima.domain.Items;

import java.util.List;

public interface ItemsService {

    public Items findById(Integer id);

    List<Items> findAll();

    void delete(Integer id);
}
