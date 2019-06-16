package cn.itcast.contorller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsContorller {

    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findById")
    public ModelAndView findById(int id,ModelAndView modelAndView){
        Items item = itemsService.findById(id);
       modelAndView.addObject("item",item);
       modelAndView.setViewName("show");
        return modelAndView;
    }
}
