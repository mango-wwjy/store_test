package com.shxt.modual.goods.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.shxt.base.util.Page;
import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.goods.model.Select;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 商品，业务层接口
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:51:03
 * @description
 */
public interface GoodsService {

    /**
     * 查看商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    List<Goods> list();

    /**
     * 分页查看商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    List<Goods> page(Page page, Select s);

    /**
     * 根据主键查询商品
     *
     * @param id
     * @return Goods
     * @author
     * @date 下午6:14:37
     */
    Goods get(String g_id);

    /**
     * 查看一级分类
     *
     * @return List<Classes>
     * @author
     * @date 下午7:50:46
     */
    List<Classes> firstClassList();

    /**
     * 获得二级分类json
     *
     * @return String
     * @author
     * @date 下午7:50:46
     */
    String secondClassList(String f_id);

    /**
     * 查看一级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:46
     */
    List<FirstClass> b_firstClassList();

    /**
     * 查看二级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:46
     */
    List<SecondClass> getSecondClassList(String f_id);

    /**
     * 获得f_id
     *
     * @return String
     * @author
     * @date 下午7:50:46
     */
    String getF_id(String g_id);


    /**
     * 添加商品
     *
     * @param photoFile3
     * @param photoFile2
     * @param e          void
     * @author
     * @date 下午6:52:28
     */
    void add(Goods g, MultipartFile photoFile, MultipartFile photoFile2, MultipartFile photoFile3, HttpServletRequest request);


    /**
     * 查看隐藏商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    List<Goods> hiddenList();


    /**
     * 修改商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void update(Goods g, MultipartFile photoFile1, MultipartFile photoFile2, MultipartFile photoFile3, HttpServletRequest request);

    /**
     * 隐藏商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void hide(String g_id);

    /**
     * 恢复商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void recover(String g_id);

    /**
     * 删除商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    void delete(String g_id);
}
