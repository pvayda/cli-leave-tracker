package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserListTest {
    UserList list;
    User snuffy;
    @BeforeEach
    public void each(){
        list = new UserList();
        snuffy = new User("snuffy");
    }
    @Test
    public void testAddUser(){
        list.addUser(snuffy);
        String result = list.getUser("snuffy").getName();
        assertEquals("snuffy", result);
    }
    @Test
    public void testGetLeaveDays(){
        list.addUser(snuffy);
        int result = list.getUser("snuffy").getLeaveDays();
        assertEquals(0, result);
    }
    @Test
    public void testPrintIndLeaveDays(){
        list.addUser(snuffy);
        String result = list.printUserLeave("snuffy");
        assertEquals("snuffy - Leave 0", result);
    }
}
