package mytest;

import users.dao.UsersysDao;
import users.dao.UsersysImpl;
import users.entity.Usersys;


public class Test {
  @org.junit.Test
  public void testAdd() {
    Usersys usersys = new Usersys();
    usersys.setId("leo111");
    usersys.setPwd("123");
    UsersysDao dao = new UsersysImpl();
    dao.add(usersys);
  }

  /*@org.junit.Test
  public void testList() {
    UserService service = new UserService();
    PageInfo<Usersys> pageInfo = service.listCity(1, 10, "江西", "123");
    List<Usersys> list = pageInfo.getList();
    list.forEach(list1 -> System.out.println(list1.getId()));
  }*/

}
