package com.seungdols.practice;

import com.seungdols.Meeting;

/**
 * @PACKAGE com.seungdols.practice
 * @Author seungdols
 * @Date 2020-04-16
 */
public class Program {
    public static void main(String[] args) {
        Meeting meetingBoard = new Meeting("Board Meeting");

        meetingBoard.setLocation("London");
        System.out.println("The meeting is in" + meetingBoard.getLocation());

        meetingBoard.description = "A board Meeting";
//        System.out.println(Meeting.Companion.getAPP_VERSION());
        System.out.println(Meeting.APP_VERSION);
    }
}
