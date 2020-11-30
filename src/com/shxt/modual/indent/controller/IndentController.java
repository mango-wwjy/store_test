package com.shxt.modual.indent.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.shxt.base.util.DateUtils;
import com.shxt.base.util.Page;
import com.shxt.modual.customer.model.Customer;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.indent.model.Indent;
import com.shxt.modual.indent.model.Select;
import com.shxt.modual.indent.service.IndentService;

/**
 * 订单控制层
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:15:40
 * @description
 */
@Controller
@RequestMapping("/indent")
public class IndentController {

    //业务层对象
    @Autowired
    private IndentService indentService;


    /**
     * AJAX收货
     *
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException         String
     * @author
     * @title: shouhuo
     * @date 下午5:53:43
     */
    @RequestMapping(value = "/shouhuo")
    @ResponseBody
    public void shouhuo(Indent i, HttpServletRequest request, HttpServletResponse response) {

        indentService.shouhuo(i);

    }

    /**
     * 添加订单
     *
     * @return ModelAndView
     * @author
     * @date 下午6:45:52
     */
    @RequestMapping(value = "/add")
    public String add(String a_id, Integer money, HttpServletRequest request, HttpServletResponse response) {
        Customer c = (Customer) request.getSession().getAttribute("customer");

        //获取当前时间
        DateUtils du = new DateUtils();
        String date = du.getDateTime();

        Indent i = new Indent();

        i.setDate(date);
        i.setI_id(UUID.randomUUID().toString());
        i.setComment("");
        i.setC_id(c.getC_id());
        i.setA_id(a_id);

        List<Goods> cartList = indentService.cartList(c.getC_id());
        for (Goods g : cartList) {
            i.setG_id(g.getG_id());
            i.setNum(g.getNum());
            indentService.add(i);
            indentService.addSelnum(i);
        }

        //增加积分
        i.setMoney(money);
        indentService.addSpend(i);

        indentService.deleteCart(c.getC_id());

        return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/indent/paging";
    }

    /**
     * 分页查看订单
     *
     * @return ModelAndView
     * @author
     * @date 下午6:45:52
     */
    @RequestMapping("/paging")
    public ModelAndView paging(Page page, Select s, HttpServletRequest request, HttpServletResponse response) {
        Customer c = (Customer) request.getSession().getAttribute("customer");

        s.setC_id(c.getC_id());

        page.setSize(5);
        ModelAndView mav = new ModelAndView("indent/list");

        List<Indent> list = indentService.page(page, s);

        mav.addObject("list", list);
        mav.addObject("page", page);
        mav.addObject("select", s);

        return mav;
    }

    /**
     * 查看所有订单
     *
     * @return ModelAndView
     * @author
     * @date 下午6:45:52
     */
    @RequestMapping("/b_list")
    public ModelAndView b_list(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView mav = new ModelAndView("indent/b_list");

        List<Indent> list = indentService.list();

        mav.addObject("list", list);

        return mav;
    }

    /**
     * 显示评价
     *
     * @return ModelAndView
     * @author
     * @date 下午6:09:52
     */
    @RequestMapping("/pingjiaShow")
    public ModelAndView pingjiaShow(Indent i) {
        ModelAndView mav = new ModelAndView("indent/pingjia");
        Goods g = indentService.getGoods(i.getG_id());

        mav.addObject("g", g);
        mav.addObject("i", i);

        return mav;
    }

    /**
     * 评价
     *
     * @param i
     * @author
     * @date 下午6:26:42
     */
    @RequestMapping("/pingjia")
    public String pingjia(Indent i) {

        indentService.pingjia(i);

        return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/indent/paging";
    }
}
