package com.medipol.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    @Autowired
    public UserService(){

        final User erim = new User(1l, "erim", "erturk");
        users.add(erim);
        users.add(new User(2l, "mustafa", "can"));
        users.add(new User(3l, "recep", "efe"));
    }

    public List<User> findUsers(){
        return users;
    }

    public List<User> findUsersByName(String name){

        for (User user : users) {
            if (user.getName().equals(name)){

                List<User> res = new ArrayList<>();
                res.add(user);

                return res;
            }
        }
        return new ArrayList<>();
    }


}
