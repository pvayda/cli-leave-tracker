package com.galvanize;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        UserList list = new UserList();
        User snuffy = new User("snuffy");
        list.addUser(snuffy);

        if(args[0] == "user"){
            if(list.getUser(args[1]) != null){
                if(args[2] == "pl"){
                    System.out.print(list.printUserLeave(args[1]));
                } else {
                    System.out.println("Please enter a valid action");
                }

            } else{
                System.out.println("Please Enter a Valid User");
            }
        } else {
            System.out.println("please use a valid keyword (i.e. 'user')");
        }

    }
}
