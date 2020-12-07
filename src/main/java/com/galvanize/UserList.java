package com.galvanize;

import java.util.HashMap;

public class UserList {
    HashMap<String, User> userMap;
    UserList(){
        this.userMap = new HashMap<>();
    }
    public void addUser(User person){
        this.userMap.put(person.getName(), person);
    }
    public User getUser(String name){
        return this.userMap.get(name);
    }
    public String printUserLeave(String name){
        String leaveString = String.format("%s - Leave %s", this.getUser(name).getName(), this.getUser(name).getLeaveDays());
        return leaveString;
    }

    public String printAllLeave() {
        String allLeaveString = "";
        int total = userMap.size();
        int counter = 0;
        for(String key : userMap.keySet()){
            if(counter == total - 1){
                allLeaveString += printUserLeave(key);
            } else {
                allLeaveString += printUserLeave(key) + "\n";
                counter++;
            }

        }
        return allLeaveString;
    }
}
