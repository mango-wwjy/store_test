package com.shxt.modual.customer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.shxt.modual.customer.model.Customer;

/**
 * 用户，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface CustomerService {

    /**
     * 登录
     *
     * @param account
     * @return Customer
     * @author
     * @date 下午6:52:28
     */
    Customer check(String account);

    /**
     * 添加用户
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    void add(Customer c, MultipartFile photoFile, HttpServletRequest request);

    /**
     * 根据主键查询用户
     *
     * @param id
     * @return Customer
     * @author
     * @date 下午6:14:37
     */
    Customer get(String c_id);

    /**
     * 修改用户
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void update(Customer c, MultipartFile photoFile, HttpServletRequest request);

    /**
     * 修改密码
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void pswUpdate(Customer c);

    /**
     * 验证账号
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    String checkAccount(String account);

    /**
     * 查看用户
     *
     * @return List<Customer>
     * @author
     * @date 下午7:50:46
     */
    List<Customer> list();

    /**
     * 查看隐藏用户
     *
     * @return List<Customer>
     * @author
     * @date 下午7:50:46
     */
    List<Customer> hiddenList();

    /**
     * 隐藏用户
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void hide(String c_id);

    /**
     * 恢复用户
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void recover(String c_id);

    /**
     * 删除用户
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void delete(String c_id);
}
