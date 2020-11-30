package com.shxt.modual.address.service;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.address.model.Place;

/**
 * 地址，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface AddressService {

    /**
     * 添加地址
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    void add(Address a);

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:46
     */
    List<Address> list(String c_id);

    /**
     * 查看省份
     *
     * @return List<Place>
     * @author
     * @date 下午7:50:46
     */
    List<Place> provinceList();

    /**
     * 删除地址
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void delete(String a_id);

    /**
     * 获得二级分类json
     *
     * @return String
     * @author
     * @date 下午7:50:46
     */
    String cityList(String p_id);
}
