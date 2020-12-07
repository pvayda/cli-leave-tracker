package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserListTest {

    @Test
    public void testAddUser(){
        UserList list = new UserList();
        User snuffy = new User("snuffy");
        list.addUser(snuffy);
        String result = list.getUser("snuffy").getName();
        assertEquals("snuffy", result);
    }
    @Test
    public void testGetLeaveDays(){
        UserList list = new UserList();
        User snuffy = new User("snuffy");
        list.addUser(snuffy);
        int result = list.getUser("snuffy").getLeaveDays();
        assertEquals(0, result);
    }
    @Test
    public void testPrintIndLeaveDays(){
        UserList list = new UserList();
        User snuffy = new User("snuffy");
        list.addUser(snuffy);
        String result = list.printUserLeave("snuffy");
        assertEquals("snuffy - Leave 0", result);
    }
}
