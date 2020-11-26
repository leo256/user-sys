package users.controller;

import users.dao.UsersysDao;
import users.dao.UsersysImpl;
import users.entity.Usersys;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;

import java.util.List;

public class UsersysServlet {
  /*
  添加的方法
   */
  @WebRequest("/add")
  public void add(Usersys usersys) {
    try {
      UsersysDao dao = new UsersysImpl();
      dao.add(usersys);
      new JsonView(usersys);
    } catch (Exception e) {
      new JsonView(500);
    }
  }

  @WebRequest("/list")
  /*查询所有*/
  public JsonView getProductList(Usersys usersys) {
    UsersysDao dao = new UsersysImpl();
    List<Usersys> list = dao.listProduct(usersys);
    return new JsonView(list);
  }
}
