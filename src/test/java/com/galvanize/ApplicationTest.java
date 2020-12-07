package com.galvanize;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    PrintStream original;
    ByteArrayOutputStream outContent;

    // This block captures everything written to System.out
    @BeforeEach
    public void setOut() {
        original = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    // This block resets System.out to whatever it was before
    @AfterEach
    public void restoreOut() {
        System.setOut(original);
    }
    @Test
    public void testPrintLeave(){
        Application.main(new String[]{"user", "snuffy", "pl"});
        String result = outContent.toString();
        assertEquals("snuffy - Leave 0", result);
    }
    @Test
    public void testAdminPrintLeave(){
        Application.main(new String[]{"admin", "all", "pl"});
        String result = outContent.toString();
        assertEquals("snuffy - Leave 0\nCaptain America - Leave 30\nJon Snow - Leave 0", result);
    }


}
