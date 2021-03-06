package pe.edu.tecsup.sharedpreferencesapp.Repository;

import java.util.ArrayList;
import java.util.List;

import pe.edu.tecsup.sharedpreferencesapp.Models.User;

/**
 * Created by Alumno on 17/04/2018.
 */

public class UserRepository {

    public static List<User> users = new ArrayList<>();

    static{
        users.add(new User(100, "ebenites", "tecsup", "Erick Benites"));
        users.add(new User(200, "jfarfan", "tecsup", "Jaime Farfán"));
        users.add(new User(300, "angieguevara", "tecsup", "Angie Guevara"));
    }

    public static User login(String username, String password){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User getUser(String username){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return user;
            }
        }
        return null;
    }

}
