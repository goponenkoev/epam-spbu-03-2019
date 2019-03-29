package models;

import services.UserService;

import java.util.LinkedList;
import java.util.List;

public class Users implements UserService {
    List<User> users;

    public Users(List<User> users){
        this.users = users;
    }
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User addUserByName(String username) {
        User new_user = new User(username);
        users.add(new_user);
        return new_user;
    }

    @Override
    public User updateUserByName(String username) {
        for (User user: users) {
            String name = user.getUsername();
            if (name.equals(username)) {
                user.setUsername(username);
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        for (User user: users) {
            String name = user.getUsername();
            if (name.equals(username))
                return user;
        }
        return null;
    }

    @Override
    public boolean deleteUserByUserName(String username) {
        for (User user: users) {
            String name = user.getUsername();
            if (name.equals(username)) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> sortAllUsers(String what, String type) {
        switch (what){
            case "age":
                   return sort(users,type);
        }
        return null;
    }
    private List <User> sort(List <User> oldList,String type){

        switch (type){
            //по возрастанию
            case "0":
                for (int i = 0; i < oldList.size(); i++){
                    for (int j = i+1; j < oldList.size(); j++){
                        int firstAge = oldList.get(i).getAge();
                        int secondtAge = oldList.get(j).getAge();
                        if(firstAge > secondtAge) {
                            User val = oldList.get(i);
                            oldList.set(i,oldList.get(j));
                            oldList.set(j,val);
                        }
                    }
                }
                break;
                //по убыванию
            case "1":
                for (int i = 0; i < oldList.size(); i++){
                    for (int j = i+1; j < oldList.size(); j++){
                        int firstAge = oldList.get(i).getAge();
                        int secondtAge = oldList.get(j).getAge();
                        if(firstAge < secondtAge) {
                            User val = oldList.get(i);
                            oldList.set(i,oldList.get(j));
                            oldList.set(j,val);
                        }
                    }
                }
                break;
        }
        return oldList;
    }
    @Override
    public List<User> filterUsers(Integer amount) {
        int i = 1;
        List<User> new_list = new LinkedList<User>();
        for (User user: users) {
            if(i<=amount)
               new_list.add(user);
            i++;
        }
        return new_list;
    }
}
