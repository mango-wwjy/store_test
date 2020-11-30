package com.shxt.modual.employee.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.shxt.modual.employee.model.Employee;

/**
 * 员工，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface EmployeeService {

    /**
     * 登录
     *
     * @param account
     * @return Customer
     * @author
     * @date 下午6:52:28
     */
    Employee check(String account);

    /**
     * 添加员工
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    public void add(Employee e, MultipartFile photoFile, HttpServletRequest request);

    /**
     * 查看员工
     *
     * @return List<Employee>
     * @author
     * @date 下午7:50:46
     */
    List<Employee> list();

    /**
     * 查看隐藏员工
     *
     * @return List<Employee>
     * @author
     * @date 下午7:50:46
     */
    List<Employee> hiddenList();

    /**
     * 根据主键查询员工
     *
     * @param id
     * @return Employee
     * @author
     * @date 下午6:14:37
     */
    public Employee get(String e_id);

    /**
     * 修改员工
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    public void update(Employee e, MultipartFile photoFile, HttpServletRequest request);

    /**
     * 修改员工信息
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    public void updateInfo(Employee e, MultipartFile photoFile, HttpServletRequest request);

    /**
     * 隐藏员工
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void hide(String e_id);

    /**
     * 恢复员工
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void recover(String e_id);

    /**
     * 删除员工
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void delete(String e_id);

    /**
     * 获得账号
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    public String getAccount(String name);
}
