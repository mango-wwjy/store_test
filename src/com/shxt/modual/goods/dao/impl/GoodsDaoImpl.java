package com.shxt.modual.goods.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shxt.base.dao.impl.BaseDaoImpl;
import com.shxt.base.util.Page;
import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.goods.dao.GoodsDao;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.goods.model.Select;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 商品，数据访问层，实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date 下午6:58:55
 * @description
 */
@Repository("goodsDao")
public class GoodsDaoImpl extends BaseDaoImpl implements GoodsDao {

    /**
     * 查看商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Goods> list() {
        SqlSession session = getSqlSession();

        List<Goods> list = session.selectList(Goods.class.getName() + ".list");
        return list;
    }

    /**
     * 分页查看商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Goods> page(Page page, Select s) {
        SqlSession session = getSqlSession();

        //每页显示的行数
        int size = page.getSize();

        //总记录数
        Integer count = session.selectOne(Goods.class.getName() + ".paging_count", s);
        page.setCount(count);

        //总页数
        page.setAll(count % size == 0 ? count / size : count / size + 1);

        if (page.getIndex() < 1) {
            page.setIndex(1);
        }

        if (page.getIndex() > page.getAll()) {
            page.setIndex(page.getAll());
        }

        //起始记录数
        int start = (page.getIndex() - 1) * page.getSize();

        s.setStart(start);
        s.setSize(size);
        List<Goods> list = session.selectList(Goods.class.getName() + ".paging", s);

        return list;
    }

    /**
     * 根据主键查询一条数据
     *
     * @param id
     * @return Goods
     * @author
     * @date 下午6:13:42
     */
    @Override
    public Goods get(String g_id) {
        SqlSession session = getSqlSession();
        Goods g = session.selectOne(Goods.class.getName() + ".get", g_id);
        return g;
    }

    /**
     * 查看一级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Classes> firstClassList() {
        SqlSession session = getSqlSession();

        List<Classes> list = session.selectList(Classes.class.getName() + ".firstClassList");
        return list;
    }

    /**
     * 查看二级分类
     *
     * @return List<SecondClass>
     * @author
     * @date 下午6:13:42
     */
    @Override
    public List<Classes> secondClassList(String f_id) {
        SqlSession session = getSqlSession();
        List<Classes> list = session.selectList(Classes.class.getName() + ".secondClassList", f_id);
        return list;
    }

    /**
     * 获得f_id
     *
     * @return String
     * @author
     * @date 下午6:13:42
     */
    @Override
    public String getF_id(String g_id) {
        SqlSession session = getSqlSession();
        SecondClass s = session.selectOne(Goods.class.getName() + ".getF_id", g_id);
        return s.getF_id().toString();
    }

    /**
     * 获得ID
     *
     * @author
     * @date 下午6:13:42
     */
    @Override
    public Goods getId() {
        SqlSession session = getSqlSession();
        Goods g = session.selectOne(Goods.class.getName() + ".getId");
        return g;
    }

    /**
     * 添加
     *
     * @param r void
     * @author
     * @date 下午7:02:38
     */
    @Override
    public void add(Goods g) {
        SqlSession session = getSqlSession();
        session.insert(Goods.class.getName() + ".add", g);
    }


    /**
     * 查看隐藏商品
     *
     * @return List<Goods>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<Goods> hiddenList() {
        SqlSession session = getSqlSession();

        List<Goods> list = session.selectList(Goods.class.getName() + ".hiddenList");
        return list;
    }


    /**
     * 修改商品
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void update(Goods g) {
        SqlSession session = getSqlSession();

        session.update(Goods.class.getName() + ".update", g);
    }

    /**
     * 隐藏商品
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void hide(String g_id) {
        SqlSession session = getSqlSession();

        session.update(Goods.class.getName() + ".hide", g_id);
    }

    /**
     * 恢复商品
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void recover(String g_id) {
        SqlSession session = getSqlSession();

        session.update(Goods.class.getName() + ".recover", g_id);
    }

    /**
     * 删除商品
     *
     * @param r void
     * @author
     * @date 下午6:30:00
     */
    @Override
    public void delete(String g_id) {
        SqlSession session = getSqlSession();

        session.delete(Goods.class.getName() + ".delete", g_id);
    }

    /**
     * 查看一级分类
     *
     * @return List<FirstClass>
     * @author
     * @date 下午7:50:01
     */
    @Override
    public List<FirstClass> b_firstClassList() {
        SqlSession session = getSqlSession();

        List<FirstClass> list = session.selectList(Classes.class.getName() + ".firstClassList");
        return list;
    }

    /**
     * 查看二级分类
     *
     * @return List<SecondClass>
     * @author
     * @date 下午6:13:42
     */
    @Override
    public List<SecondClass> b_secondClassList(String f_id) {
        SqlSession session = getSqlSession();
        List<SecondClass> list = session.selectList(Classes.class.getName() + ".secondClassList", f_id);
        return list;
    }

}
