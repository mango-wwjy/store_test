package com.shxt.modual.classes.service;

import java.util.List;

import com.shxt.modual.classes.model.Classes;

/**
 * 二级分类，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface ClassesService {

    /**
     * 查看二级分类
     *
     * @return List<Classes>
     * @author
     * @date 下午7:50:46
     */
    List<Classes> secondClassList();

    /**
     * 查看一级分类
     *
     * @return List<Classes>
     * @author
     * @date 下午7:50:46
     */
    List<Classes> firstClassList();

}
