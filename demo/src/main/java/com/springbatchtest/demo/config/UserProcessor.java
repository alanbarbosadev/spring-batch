package com.springbatchtest.demo.config;

import com.springbatchtest.demo.entity.User;
import org.springframework.batch.item.ItemProcessor;

public class UserProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {
        //Process here
        return user;
    }
}
