package com.galvanize;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        UserList list = new UserList();
        User snuffy = new User("snuffy");
        User captUSA = new User("Captain America", 30);
        User jonSnow = new User("Jon Snow");
        list.addUser(snuffy);
        list.addUser(captUSA);
        list.addUser(jonSnow);

        if (args[0] == "user") {
            if (list.getUser(args[1]) != null) {
                if (args[2] == "pl") {
                    System.out.print(list.printUserLeave(args[1]));
                } else {
                    System.out.println("Please enter a valid action");
                }

            } else {
                System.out.println("Please Enter a Valid User");
            }
        } else if (args[0] == "admin"){
            if(args[1] == "all"){
                if(args[2] == "pl"){
                    System.out.print(list.printAllLeave());
                } else {
                    System.out.println("Please Enter a valid action");
                }
            } else {
                System.out.println("Enter a proper admin selector");
            }
        } else {
            System.out.println("please use a valid keyword (i.e. 'user')");
        }

    }
}
