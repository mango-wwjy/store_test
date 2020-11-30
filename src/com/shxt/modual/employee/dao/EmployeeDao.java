package com.shxt.modual.employee.dao;

import java.util.List;

import com.shxt.modual.employee.model.Employee;

/**
 * 员工，数据访问层,接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:59:08
 * @description
 */
public interface EmployeeDao {

    /**
     * 登录
     *
     * @param account
     * @return Customer;
     * @author
     * @date 下午6:13:42
     */
    Employee check(String account);

    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    void add(Employee e);

    /**
     * 查看员工
     *
     * @return List<Employee>
     * @author
     * @date 下午7:50:01
     */
    List<Employee> list();

    /**
     * 查看隐藏员工
     *
     * @return List<Employee>
     * @author
     * @date 下午7:50:01
     */
    List<Employee> hiddenList();


    /**
     * 根据主键查询一条数据
     *
     * @param id
     * @return Employee;
     * @author
     * @date 下午6:13:42
     */
    Employee get(String e_id);

    /**
     * 判断账号是否重复
     *
     * @param account
     * @return Employee;
     * @author
     * @date 下午6:13:42
     */
    List<Employee> checkAccount(String account);

    /**
     * 修改员工
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    void update(Employee e);

    /**
     * 隐藏员工
     *
     * @param id
     * @return Employee;
     * @author
     * @date 下午6:13:42
     */
    void hide(String e_id);

    /**
     * 恢复员工
     *
     * @param id
     * @return Employee;
     * @author
     * @date 下午6:13:42
     */
    void recover(String e_id);

    /**
     * 删除员工
     *
     * @param id
     * @return Employee;
     * @author
     * @date 下午6:13:42
     */
    void delete(String e_id);
}
