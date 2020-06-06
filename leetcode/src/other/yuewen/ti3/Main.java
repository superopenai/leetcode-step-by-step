package yuewen.ti3;

import java.util.Scanner;

/**
 * @author Desti
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start =scanner.nextLine();
        String end =scanner.nextLine();
        String[] sp1 = start.split(" ");
        String[] left1 = sp1[0].split("-");
        int year1 =Integer.parseInt(left1[0]);
        int month1 =Integer.parseInt(left1[1]);
        int day1 =Integer.parseInt(left1[2]);
        String[] right1 = sp1[1].split(":");
        int hour1 =Integer.parseInt(right1[0]);
        int min1 =Integer.parseInt(right1[1]);
        int sec1 =Integer.parseInt(right1[2]);
        int totalSec1 =(hour1*3600)+(min1*60)+sec1;
        int totalMin1 = totalSec1 / 60;

        String[] sp2 = end.split(" ");
        String[] left2 = sp2[0].split("-");
        int year2 =Integer.parseInt(left2[0]);
        int month2 =Integer.parseInt(left2[1]);
        int day2 =Integer.parseInt(left2[2]);
        String[] right2 = sp2[1].split(":");
        int hour2 =Integer.parseInt(right2[0]);
        int min2 =Integer.parseInt(right2[1]);
        int sec2 =Integer.parseInt(right2[2]);
        int totalSec2 =(hour2*3600)+(min2*60)+sec2;
        int totalMin2 = totalSec2 / 60;

        int res = ((month2 - month1) * 30 + (day2 - day1)) * 24 * 60;
        System.out.println(res+totalMin2-totalMin1);


    }
}
