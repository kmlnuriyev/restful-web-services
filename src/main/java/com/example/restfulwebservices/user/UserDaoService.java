package com.example.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            users.add(new User(i, new String("K" + i), new Date()));
        }
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {

        users.add(user);

        return user;
    }

    public User deleteUser(User user) {

        users.remove(user);

        return user;
    }

    public User findUser(int id) {

        for(User user:users) {
            if (id == user.getId()) {
                return user;
            }
        }

        return null;
    }
}
