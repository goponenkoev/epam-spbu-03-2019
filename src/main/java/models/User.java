package models;

import enums.Gender;
import enums.UserStatus;

public class User {

  private Integer age;
  private String username;
  private Gender gender;
  private UserStatus userStatus;

  //TODO: add necessary constructors (use Alt+insert)

  public User(Integer age) {
    this.age = age;
  }
  public User(String username) {
    this.username = username;
  }

  public User(Gender gender) {
    this.gender = gender;
  }

  public User(UserStatus userStatus) {
    this.userStatus = userStatus;
  }
  //TODO: add all necessary getters and setters (use Alt+insert)
//getters
  public Integer getAge() {
    return age;
  }

  public String getUsername() {
    return username;
  }

  public Gender getGender() {
    return gender;
  }

  public UserStatus getUserStatus() {
    return userStatus;
  }

//setters
  public void setAge(Integer age) {
    this.age = age;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public void setUserStatus(UserStatus userStatus) {
    this.userStatus = userStatus;
  }

}
