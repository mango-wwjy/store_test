package com.shxt.modual.indent.dao;

import java.util.List;

import com.shxt.base.util.Page;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.indent.model.Indent;
import com.shxt.modual.indent.model.Select;

/**
 * 订单，数据访问层,接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:59:08
 * @description
 */
public interface IndentDao {

    /**
     * 分页查看订单
     *
     * @return List<Reader>
     * @author
     * @date 下午7:50:01
     */
    List<Indent> page(Page page, Select s);

    /**
     * 查看全部订单
     *
     * @return List<Reader>
     * @author
     * @date 下午7:50:01
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
     * 查看积分
     *
     * @author
     * @date 下午6:52:28
     */
    Integer getSpend(String c_id);

    /**
     * 增加销量
     *
     * @author
     * @date 下午6:52:28
     */
    void addSelnum(Indent i);

    /**
     * 查看销量
     *
     * @author
     * @date 下午6:52:28
     */
    Integer getSelnum(String g_id);

    /**
     * 清空购物车
     *
     * @param id
     * @author
     * @date 下午6:13:42
     */
    void deleteCart(String c_id);

    /**
     * 根据主键查询一条数据
     *
     * @param id
     * @return Goods;
     * @author
     * @date 下午6:13:42
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
