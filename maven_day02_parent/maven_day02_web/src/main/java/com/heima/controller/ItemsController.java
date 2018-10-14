package com.heima.controller;

import com.heima.domain.Items;
import com.heima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail.do")
    public ModelAndView findDetail(Integer id){
        ModelAndView mv = new ModelAndView();
        Items items = itemsService.findById(id);
        mv.addObject("list",items);
        mv.setViewName("itemDetail");
        return mv;
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Items> list = itemsService.findAll();
        mv.addObject("list",list);
        mv.setViewName("itemDetail");
        return mv;
    }

    @RequestMapping("/delete.do")
    public String delete(Integer id){
        itemsService.delete(id);

        return "redirect:findAll.do";
    }


}
