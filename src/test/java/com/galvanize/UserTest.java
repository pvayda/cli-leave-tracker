package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testGetName(){
        User person = new User("Jorge");
        String result = person.getName();
        assertEquals("Jorge", result);
    }
    @Test
    public void testGetLeaveDays(){
        User person = new User("Jorge");
        int result = person.getLeaveDays();
        assertEquals(0, result);
    }
}
