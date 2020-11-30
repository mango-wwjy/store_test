package com.shxt.modual.address.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.shxt.modual.address.dao.AddressDao;
import com.shxt.modual.address.model.Address;
import com.shxt.modual.address.model.Place;
import com.shxt.modual.address.service.AddressService;

/**
 * 地址业务层实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:50:55
 * @description
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {

    /**
     * 数据访问层
     */
    @Autowired
    private AddressDao addressDao;

    /**
     * 添加地址
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    @Override
    public void add(Address a) {
        int id = 0;
        List<Address> list = addressDao.getId();
        if (CollectionUtils.isEmpty(list)) {
            id = 1;
        } else {
            Integer a_id = list.get(0).getA_id();
            id = a_id + 1;
        }


        a.setA_id(id);
        addressDao.add(a);
    }

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Address> list(String c_id) {
        return addressDao.list(c_id);
    }

    /**
     * 查看省份
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Place> provinceList() {
        return addressDao.provinceList();
    }

    /**
     * 删除地址
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void delete(String a_id) {
        addressDao.delete(a_id);
    }

    /**
     * 获得二级分类
     *
     * @author
     * @date 下午6:30:42
     */
    @Override
    public String cityList(String p_id) {
        List<Place> list = addressDao.cityList(p_id);
        String s = "[";
        if (list.isEmpty()) {
            s += "{\"s_id\":\"0\",\"name\":\"该省份下没有城市\"}";
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    s += ",";
                }
                s += "{\"p_id\":\"" + list.get(i).getP_id() + "\",\"name\":\"" + list.get(i).getName() + "\"}";
            }
        }
        s += "]";
        return s;
    }
}
