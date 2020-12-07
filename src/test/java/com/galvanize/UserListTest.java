package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserListTest {
    UserList list;
    User snuffy;
    User captUSA;
    User jonSnow;
    @BeforeEach
    public void each(){
        list = new UserList();
        snuffy = new User("snuffy");
        captUSA = new User("Captain America", 30);
        jonSnow = new User("Jon Snow");
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
    @Test
    public void testPrintAllLeaveList(){
        list.addUser(snuffy);
        list.addUser(captUSA);
        list.addUser(jonSnow);
        String result = list.printAllLeave();
        assertEquals("snuffy - Leave 0\nCaptain America - Leave 30\nJon Snow - Leave 0", result);

    }
}
