package com.shxt.modual.cart.dao;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;

/**
 * 购物车，数据访问层,接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:59:08
 * @description
 */
public interface CartDao {
    /**
     * 添加购物车
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    void add(Cart c);

    /**
     * 查看购物车
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:01
     */
    List<Goods> list(String c_id);

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:01
     */
    List<Address> addressList(String c_id);

    /**
     * 查询购物车
     *
     * @return Cart
     * @author
     * @date 下午6:14:37
     */
    Cart get(Cart c);

    /**
     * 修改购物车
     *
     * @author
     * @date 下午6:30:00
     */
    void update(Cart c);

    /**
     * 清空购物车
     *
     * @param id
     * @return Cart;
     * @author
     * @date 下午6:13:42
     */
    void delete(String c_id);

    /**
     * 删除购物车
     *
     * @param id
     * @return Cart;
     * @author
     * @date 下午6:13:42
     */
    void delete(Cart c);
}
