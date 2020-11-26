package users.dao;

import users.entity.Usersys;


import java.util.List;

public interface UsersysDao {
  void checklogin(Usersys usersys); // 检查密码

  void add(Usersys usersys);

  /*查询全部*/
  List<Usersys> listProduct(Usersys usersys);
}
