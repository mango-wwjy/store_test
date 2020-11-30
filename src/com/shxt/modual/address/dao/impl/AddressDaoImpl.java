package com.shxt.modual.address.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shxt.base.dao.impl.BaseDaoImpl;
import com.shxt.modual.address.dao.AddressDao;
import com.shxt.modual.address.model.Address;
import com.shxt.modual.address.model.Place;

/**
 * 地址，数据访问层，实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:58:55
 * @description
 */
@Repository("addressDao")
public class AddressDaoImpl extends BaseDaoImpl implements AddressDao {

    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    @Override
    public void add(Address a) {
        SqlSession session = getSqlSession();

        session.insert(Address.class.getName() + ".add", a);
    }

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Address> list(String c_id) {
        SqlSession session = getSqlSession();

        List<Address> list = session.selectList(Address.class.getName() + ".list", c_id);
        return list;
    }

    /**
     * 查看省份
     *
     * @return List<Place>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Place> provinceList() {
        SqlSession session = getSqlSession();

        List<Place> list = session.selectList(Address.class.getName() + ".provinceList");
        return list;
    }

    /**
     * 查看省份
     *
     * @return List<Place>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Place> cityList(String p_id) {
        SqlSession session = getSqlSession();

        List<Place> list = session.selectList(Address.class.getName() + ".cityList", p_id);
        return list;
    }

    /**
     * 获得id
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Address> getId() {
        SqlSession session = getSqlSession();

        List<Address> list = session.selectList(Address.class.getName() + ".getId");
        return list;
    }

    /**
     * 删除地址
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void delete(String a_id) {
        SqlSession session = getSqlSession();
        session.delete(Address.class.getName() + ".delete", a_id);
    }
}
