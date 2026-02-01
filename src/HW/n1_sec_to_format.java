package HW;

import java.util.Scanner;

public class n1_sec_to_format {
    public static String sec_solv(String str, int time) {
        if (time > 4 && time < 21 || time % 10 == 0) {
            return str;
        } else if (time % 10 == 1) {
            return str+"а";
        } else if (time%10 < 5) {
            return str+"ы";
        } else {
            return str;
        }
    }
    public static String h_solv(int time) {
        if (time > 4 && time < 21 || time%10 == 0) {
            return "часов";
        } else if (time%10 == 1) {
            return "час";
        } else if (time%10 < 5) {
            return "часа";
        } else {
            return "часов";
        }
    }
    public static String day_solv(int time) {
        if (time%10 == 1) {
            return "сутки";
        } else {
            return "суток";
        }
    }
    public static String week_solv(int time) {
        if (time%100 > 4 && time%100 < 21 || time%10 == 0) {
            return "недель";
        } else if (time%10 == 1) {
            return "неделя";
        } else if (time%10 < 5) {
            return "недели";
        } else {
            return "недель";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sec = in.nextInt();
        String m = "минут", s = "секунд";
        if (sec < 60) {
            System.out.println(sec + " " + sec_solv(s, sec));
        } else if (sec < 3600) {
            int res_min = sec/60, res_sec = sec%60;
            System.out.println(res_min + " " + sec_solv(m, res_min)
                    + " " + res_sec + " " + sec_solv(s, sec));
        } else if (sec < 86400){
            int res_h = sec/3600, res_min = sec%3600/60, res_sec = sec%60;
            System.out.println(res_h + " " + h_solv(res_h)
                    + " " + res_min + " " + sec_solv(m, res_min)
                    + " " + res_sec + " " + sec_solv(s, res_sec));
        } else if (sec < 604800) {
            int res_day = sec/86400, res_h = sec%86400/3600, res_min = sec%86400%3600/60, res_sec = sec%60;
            System.out.println(res_day + " " + day_solv(res_day)
                    + " " + res_h + " " + h_solv(res_h)
                    + " " + res_min + " " + sec_solv(m, res_min)
                    + " " + res_sec + " " + sec_solv(s, res_sec));
        } else {
            int res_week = sec/604800, res_day = sec%604800/86400,
                    res_h = sec%604800%86400/3600, res_min = sec%604800%86400%3600/60,
                    res_sec = sec%60;
            System.out.println(res_week + " " + week_solv(res_week)
                    + " " + res_day + " " + day_solv(res_day)
                    + " " + res_h + " " + h_solv(res_h)
                    + " " + res_min + " " + sec_solv(m, res_min)
                    + " " + res_sec + " " + sec_solv(s, res_sec));
        }
    }

}