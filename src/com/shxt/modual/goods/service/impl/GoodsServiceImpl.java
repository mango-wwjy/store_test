package com.shxt.modual.goods.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shxt.base.util.FileUpload;
import com.shxt.base.util.Page;
import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.goods.dao.GoodsDao;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.goods.model.Select;
import com.shxt.modual.goods.service.GoodsService;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 商品业务层实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:50:55
 * @description
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    /**
     * 数据访问层
     */
    @Autowired
    private GoodsDao goodsDao;


    /**
     * 分页查看商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Goods> page(Page page, Select s) {
        return goodsDao.page(page, s);
    }


    /**
     * 查看一级分类
     *
     * @return List<Classes>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Classes> firstClassList() {
        return goodsDao.firstClassList();
    }

    /**
     * 查看一级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<FirstClass> b_firstClassList() {
        return goodsDao.b_firstClassList();
    }

    /**
     * 查看二级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<SecondClass> getSecondClassList(String f_id) {
        return goodsDao.b_secondClassList(f_id);
    }

    /**
     * 获得f_id
     *
     * @return String
     * @author
     * @date 下午7:50:46
     */
    @Override
    public String getF_id(String g_id) {
        return goodsDao.getF_id(g_id);
    }

    /**
     * 添加商品
     *
     * @param e void
     * @author
     * @date 下午6:52:28
     */
    @Override
    public void add(Goods g, MultipartFile photoFile1, MultipartFile photoFile2, MultipartFile photoFile3, HttpServletRequest request) {
        // id
        String id = null;
        Goods good = goodsDao.getId();
        if (null == good) {
            id = "0";
        } else {
            id = String.valueOf(Integer.valueOf(good.getG_id()) + 1);
        }

        g.setG_id(id);
        // photo
        FileUpload fu = new FileUpload();
        FileUpload fu2 = new FileUpload();
        String newFileName1 = fu.uploadFile(photoFile1, request);
        g.setPhoto1(newFileName1);
        String newFileName2 = fu.uploadFile(photoFile2, request);
        g.setPhoto2(newFileName2);
        String newFileName3 = fu2.uploadFile(photoFile3, request);
        g.setPhoto3(newFileName3 == null ? "" : newFileName3);
        goodsDao.add(g);
    }

    /**
     * 查看商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Goods> list() {
        return goodsDao.list();
    }

    /**
     * 查看隐藏商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:46
     */
    @Override
    public List<Goods> hiddenList() {
        return goodsDao.hiddenList();
    }

    /**
     * 根据主键查询商品
     *
     * @param id
     * @return Goods
     * @author
     * @date 下午6:14:37
     */
    @Override
    public Goods get(String g_id) {
        return goodsDao.get(g_id);
    }

    /**
     * 修改商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void update(Goods g, MultipartFile photoFile1, MultipartFile photoFile2, MultipartFile photoFile3, HttpServletRequest request) {
        // photo
        FileUpload fu1 = new FileUpload();
        FileUpload fu2 = new FileUpload();
        FileUpload fu3 = new FileUpload();
        String newFileName1 = fu1.uploadFile(photoFile1, request);
        g.setPhoto1(newFileName1);
        String newFileName2 = fu2.uploadFile(photoFile2, request);
        g.setPhoto2(newFileName2);
        String newFileName3 = fu3.uploadFile(photoFile3, request);
        g.setPhoto3(newFileName3);
        goodsDao.update(g);
    }

    /**
     * 隐藏商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void hide(String g_id) {
        goodsDao.hide(g_id);
    }

    /**
     * 恢复商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void recover(String g_id) {
        goodsDao.recover(g_id);
    }

    /**
     * 删除商品
     *
     * @param e void
     * @author
     * @date 下午6:30:42
     */
    @Override
    public void delete(String g_id) {
        goodsDao.delete(g_id);
    }

    /**
     * 获得二级分类
     *
     * @author
     * @date 下午6:30:42
     */
    @Override
    public String secondClassList(String f_id) {
        List<Classes> list = goodsDao.secondClassList(f_id);
        String s = "[";
        if (list.isEmpty()) {
            s += "{\"s_id\":\"0\",\"name\":\"该一级分类下没有分类\"}";
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    s += ",";
                }
                s += "{\"s_id\":\"" + list.get(i).getS_id() + "\",\"name\":\"" + list.get(i).getName() + "\"}";
            }
        }
        s += "]";
        return s;
    }
}
