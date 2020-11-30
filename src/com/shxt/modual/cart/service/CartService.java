package com.shxt.modual.cart.service;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;

/**
 * 购物车，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface CartService {

    /**
     * 添加购物车
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    void add(Cart c);

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:46
     */
    List<Address> addressList(String c_id);

    /**
     * 查看购物车
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    List<Goods> list(String c_id);

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
     * @param void
     * @author
     * @date 下午6:30:42
     */
    void update(Cart c);

    /**
     * 清空购物车
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void delete(String c_id);

    /**
     * 删除购物车
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void delete(Cart c);
}
