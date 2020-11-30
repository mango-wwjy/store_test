package com.shxt.modual.address.dao;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.address.model.Place;

/**
 * 地址，数据访问层,接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:59:08
 * @description
 */
public interface AddressDao {
    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    void add(Address a);

    /**
     * 查看地址
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:01
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
     * 查看省份
     *
     * @return List<Place>
     * @author
     * @date 下午7:50:46
     */
    List<Place> cityList(String p_id);

    /**
     * 获得id
     *
     * @return List<Address>
     * @author
     * @date 下午7:50:01
     */
    List<Address> getId();

    /**
     * 删除地址
     *
     * @param id
     * @return Address;
     * @author
     * @date 下午6:13:42
     */
    void delete(String a_id);
}
