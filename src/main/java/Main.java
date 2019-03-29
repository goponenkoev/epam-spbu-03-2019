/*
Создать приложение, в котором возможна работа с пользователями системы: удаление пользователя, перевод в другой статус,
добавление пользователя, редактирование, получение всех пользователей с их статусами и т.д
*/

import enums.Gender;
import enums.UserStatus;
import models.User;
import models.Users;
import services.UserService;

import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

//    Example:
    UserService userService;
    List<User> users = new LinkedList<User>();
    User firstUser = new User("Петя");
    firstUser.setAge(12);
    firstUser.setGender(Gender.MALE);
    firstUser.setUserStatus(UserStatus.ACTIVE);
    User secondUser = new User("Женя");
    secondUser.setAge(22);
    secondUser.setGender(Gender.FEMALE);
    secondUser.setUserStatus(UserStatus.INACTIVE);
    users.add(firstUser);
    users.add(secondUser);
    userService = new Users(users);
    User result = userService.getUserByUsername("Петя");
    System.out.println(result.getUsername()+","+result.getAge()+" лет, "+ result.getGender()+ ","+ result.getUserStatus());
    List<User> allUsers = userService.getAllUsers();
    //добавление Ромы
    userService.addUserByName("Рома");
    userService.getUserByUsername("Рома").setGender(Gender.MALE);
    System.out.println("Before:");
    for (User user: allUsers) {
      System.out.println(user.getUsername()+","+user.getAge()+" лет, "+ user.getGender()+ ","+ user.getUserStatus());
    }
    userService.updateUserByName("Рома").setUsername("Ваня");
    //все пользователи
    System.out.println("After:");
    for (User user: allUsers) {
      System.out.println(user.getUsername()+","+user.getAge()+" лет, "+ user.getGender()+ ","+ user.getUserStatus());
    }
    System.out.println("Filter:");
    //фильтрация
    List <User> filteredUsers = userService.filterUsers(2);
    for (User user: filteredUsers) {
      System.out.println(user.getUsername()+","+user.getAge()+" лет, "+ user.getGender()+ ","+ user.getUserStatus());
    }
    userService.updateUserByName("Ваня").setAge(11);
    //сортировка по возрастанию возраста
    System.out.println("Sort:");
    List <User> sortedUpUsers = userService.sortAllUsers("age","1");
    for (User user: sortedUpUsers) {
      System.out.println(user.getUsername()+","+user.getAge()+" лет, "+ user.getGender()+ ","+ user.getUserStatus());
    }
    //сортировка по убыванию возраста
    System.out.println("Sort:");
    List <User> sortedDownUsers = userService.sortAllUsers("age","2");
    for (User user: sortedDownUsers) {
      System.out.println(user.getUsername()+","+user.getAge()+" лет, "+ user.getGender()+ ","+ user.getUserStatus());
    }
    //удаление
    //userService.deleteUserByUserName("Петя");
    //System.out.println(userService.getUserByUsername("Петя").getUsername());
//

  }

}
