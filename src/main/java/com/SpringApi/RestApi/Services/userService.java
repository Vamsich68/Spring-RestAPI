package com.SpringApi.RestApi.Services;

import com.SpringApi.RestApi.User.user;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Component
public class userService {
    private  static List<user> users= new ArrayList<>();
    private static int count=0;
    static{
        users.add(new user(++count,"vamsi","trainee"));
        users.add(new user(++count,"jv","se1"));

    }
    public List<user> getall(){
        return users;
    }
    public user getById(int id){
        //return users.get(id);
        Predicate<? super user> predicate= user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
    public user save(user user){
        user.setId(++count);
        users.add(user);
        return user;
    }

}
