package com.shxt.modual.indent.service;

import java.util.List;

import com.shxt.base.util.Page;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.indent.model.Indent;
import com.shxt.modual.indent.model.Select;

/**
 * 订单，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface IndentService {

    /**
     * 分页查看订单
     *
     * @return List<Indent>
     * @author
     * @date 下午7:50:46
     */
    List<Indent> page(Page page, Select s);

    /**
     * 查看所有订单
     *
     * @return List<Indent>
     * @author
     * @date 下午7:50:46
     */
    List<Indent> list();

    /**
     * 查看购物车
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    List<Goods> cartList(String c_id);

    /**
     * 收货
     *
     * @param i void
     * @author
     * @date 下午6:52:28
     */
    void shouhuo(Indent i);

    /**
     * 添加订单
     *
     * @param i void
     * @author
     * @date 下午6:52:28
     */
    void add(Indent i);

    /**
     * 增加积分
     *
     * @author
     * @date 下午6:52:28
     */
    void addSpend(Indent i);

    /**
     * 增加销量
     *
     * @author
     * @date 下午6:52:28
     */
    void addSelnum(Indent i);

    /**
     * 清空购物车
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void deleteCart(String c_id);

    /**
     * 显示评价
     *
     * @param id
     * @return Goods
     * @author
     * @date 下午6:14:37
     */
    Goods getGoods(String g_id);

    /**
     * 评价
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void pingjia(Indent i);

}
