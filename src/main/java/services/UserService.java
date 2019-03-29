package services;

import models.User;

import java.util.List;

public interface UserService {

  List<User> getAllUsers();

  User addUserByName(String username);

  User updateUserByName(String username);

  User getUserByUsername(String username);

  boolean deleteUserByUserName(String username);

  //TODO: add more interactions with users
  //сортировка списка пользователей по параметру @what, по убыванию/возрастанию - @type
  List<User> sortAllUsers(String what, String type);
  //список пользователей из @amount человек
  List<User> filterUsers(Integer amount);
}
