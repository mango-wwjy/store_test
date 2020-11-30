package com.shxt.modual.customer.dao;

import java.util.List;

import com.shxt.modual.customer.model.Customer;

/**
 * 用户，数据访问层,接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:59:08
 * @description
 */
public interface CustomerDao {
    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    void add(Customer c);

    /**
     * 登录
     *
     * @param account
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    Customer check(String account);

    /**
     * 根据主键查询一条数据
     *
     * @param id
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    Customer get(String c_id);

    /**
     * 判断账号是否重复
     *
     * @param account
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    List<Customer> checkAccount(String account);

    /**
     * 修改用户
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    void update(Customer c);

    /**
     * 修改密码
     *
     * @param c void
     * @author
     * @date 下午6:30:00
     */
    void pswUpdate(Customer c);

    /**
     * 查看用户
     *
     * @return List<Customer>
     * @author
     * @date 下午7:50:01
     */
    List<Customer> list();

    /**
     * 查看隐藏用户
     *
     * @return List<Customer>
     * @author
     * @date 下午7:50:01
     */
    List<Customer> hiddenList();

    /**
     * 隐藏用户
     *
     * @param id
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    void hide(String c_id);

    /**
     * 恢复用户
     *
     * @param id
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    void recover(String c_id);

    /**
     * 删除用户
     *
     * @param id
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    void delete(String c_id);
}
