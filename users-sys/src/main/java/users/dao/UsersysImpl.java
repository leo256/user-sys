package users.dao;

import users.entity.Usersys;
import users.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import users.entity.Usersys;

import java.util.List;

public class UsersysImpl implements UsersysDao {


  @Override
  public void checklogin(Usersys usersys) {

  }

  @Override
  public void add(Usersys usersys) {
    // 获取SqlSession对象，并设置为true，表示自动提交事务
    try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
      // 通过getMapper方法返回一个UsrDao的代理实现类
      UsersysDao dao = sqlSession.getMapper(UsersysDao.class);
      // 调用代理对象的save方法进行保存
      dao.add(usersys);
    } catch (RuntimeException e) {
      throw e;
    }
  }

  @Override
  public List<Usersys> listProduct(Usersys usersys) {
    try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
      return sqlSession.getMapper(UsersysDao.class).listProduct(usersys);
    } catch (Exception e) {
      throw e;
    }

  }
}
