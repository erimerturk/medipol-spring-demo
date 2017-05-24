package com.medipol.springdemo;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;

public class UserServiceTest {

    @Test
    public void shouldFindUserByName() throws Exception {

        final UserService userService = new UserService();

        final List<User> response = userService.findUsersByName("mustafa");

        assertThat(response.size(), Matchers.equalTo(1));
        assertThat(response.get(0).getName(), Matchers.equalTo("mustafa"));

    }
}