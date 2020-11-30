package com.shxt.modual.cart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.cart.dao.CartDao;
import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.cart.service.CartService;
import com.shxt.modual.goods.model.Goods;

/**
 * 购物车业务层实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:50:55
 * @description
 */
@Service("cartService")
public class CartServiceImpl implements CartService {

    /**
     * 数据访问层
     */
    @Autowired
    private CartDao cartDao;

    /**
     * 添加购物车
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    @Override
    public void add(Cart c) {
        cartDao.add(c);
    }

    /**
     * 查看购物车
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Goods> list(String c_id) {
        return cartDao.list(c_id);
    }

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Address> addressList(String c_id) {
        return cartDao.addressList(c_id);
    }

    /**
     * 查询购物车
     *
     * @return Cart
     * @author
     * @date 下午6:14:37
     */
    @Override
    public Cart get(Cart c) {
        return cartDao.get(c);
    }

    /**
     * 修改购物车
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void update(Cart c) {
        cartDao.update(c);
    }

    /**
     * 清空购物车
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void delete(String c_id) {
        cartDao.delete(c_id);
    }

    /**
     * 删除购物车
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void delete(Cart c) {
        cartDao.delete(c);
    }
}
