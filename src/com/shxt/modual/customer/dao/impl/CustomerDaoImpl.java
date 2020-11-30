package com.shxt.modual.customer.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shxt.base.dao.impl.BaseDaoImpl;
import com.shxt.modual.customer.dao.CustomerDao;
import com.shxt.modual.customer.model.Customer;

/**
 * 用户，数据访问层，实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:58:55
 * @description
 */
@Repository("customerDao")
public class CustomerDaoImpl extends BaseDaoImpl implements CustomerDao {

    /**
     * 登录
     *
     * @param account
     * @return Customer
     * @author
     * @date 下午6:13:42
     */
    @Override
    public Customer check(String account) {
        SqlSession session = getSqlSession();
        Customer c = session.selectOne(Customer.class.getName() + ".login", account);
        return c;
    }

    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    @Override
    public void add(Customer c) {
        SqlSession session = getSqlSession();
        session.insert(Customer.class.getName() + ".register", c);
    }

    /**
     * 根据主键查询一条数据
     *
     * @param id
     * @return Customer
     * @author
     * @date 下午6:13:42
     */
    @Override
    public Customer get(String c_id) {
        SqlSession session = getSqlSession();
        Customer c = session.selectOne(Customer.class.getName() + ".get", c_id);
        return c;
    }

    /**
     * 判断账号是否重复
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public List<Customer> checkAccount(String account) {
        SqlSession session = getSqlSession();

        List<Customer> list = session.selectList(Customer.class.getName() + ".check", account);
        return list;
    }

    /**
     * 修改用户
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void update(Customer c) {
        SqlSession session = getSqlSession();

        session.update(Customer.class.getName() + ".update", c);
    }

    /**
     * 修改密码
     *
     * @param c void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void pswUpdate(Customer c) {
        SqlSession session = getSqlSession();
        session.update(Customer.class.getName() + ".pswUpdate", c);
    }

    /**
     * 查看用户
     *
     * @return List<Customer>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Customer> list() {
        SqlSession session = getSqlSession();

        List<Customer> list = session.selectList(Customer.class.getName() + ".list");
        return list;
    }

    /**
     * 查看隐藏用户
     *
     * @return List<Customer>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Customer> hiddenList() {
        SqlSession session = getSqlSession();

        List<Customer> list = session.selectList(Customer.class.getName() + ".hiddenList");
        return list;
    }

    /**
     * 隐藏用户
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void hide(String c_id) {
        SqlSession session = getSqlSession();

        session.update(Customer.class.getName() + ".hide", c_id);
    }

    /**
     * 恢复用户
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void recover(String c_id) {
        SqlSession session = getSqlSession();

        session.update(Customer.class.getName() + ".recover", c_id);
    }

    /**
     * 删除用户
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void delete(String c_id) {
        SqlSession session = getSqlSession();

        session.delete(Customer.class.getName() + ".delete", c_id);
    }
}
