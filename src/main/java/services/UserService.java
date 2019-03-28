package services;

import java.util.List;
import models.User;

public interface UserService {

  List<User> getAllUsers();

  User addUserByName(String username);

  User updateUserByName(String username);

  User getUserByUsername(String username);

  boolean deleteUserByUserName(String username);

  //TODO: add more interactions with users
}
