package com.shxt.modual.secondClass.dao;

import java.util.List;

import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 二级分类，数据访问层,接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:59:08
 * @description
 */
public interface SecondClassDao {
    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    void add(SecondClass s);

    /**
     * 查看二级分类
     *
     * @return List<SecondClass>
     * @author
     * @date 下午7:50:01
     */
    List<SecondClass> list();

    /**
     * 查看一级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:01
     */
    List<FirstClass> firstClassList();

    /**
     * 根据主键查询一条数据
     *
     * @param id
     * @return SecondClass;
     * @author
     * @date 下午6:13:42
     */
    SecondClass get(String s_id);

    /**
     * 判断名称是否重复
     *
     * @param account
     * @return SecondClass;
     * @author
     * @date 下午6:13:42
     */
    List<SecondClass> checkName(String name);

    /**
     * 修改二级分类
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    void update(SecondClass s);

    /**
     * 删除二级分类
     *
     * @param id
     * @return SecondClass;
     * @author
     * @date 下午6:13:42
     */
    void delete(String s_id);
}
