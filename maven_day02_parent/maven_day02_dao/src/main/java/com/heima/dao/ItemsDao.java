package com.heima.dao;

import com.heima.domain.Items;


import java.util.List;

public interface ItemsDao {


    //根据id查询
    public Items findById(Integer id);

    //查询所有
    public List<Items> findAll();

    public void delete(Integer id);
}
