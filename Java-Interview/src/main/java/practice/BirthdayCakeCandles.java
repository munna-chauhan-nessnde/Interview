package practice;

import java.util.Scanner;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int n : ar) {
            if (n >= max) {
                max = n;
            }
        }
        for (int n : ar) {
            if (n == max) {
                count++;
            }
        }
        return count;
    }

    /*
     * Complete the timeConversion function below.
     */
    /*  static String timeConversion(String s) {

      String sl = s.substring(2, s.length() - 2);
        String[] d = s.split(":");
        d[2]= d[2].replaceAll("[A-Z]{2}", "");
        Integer hh = Integer.parseInt(d[0]);
        if(hh==12){
            if (s.contains("AM")) {
                return "00:"+d[1]+":"+d[2];
            }else{
                return d[0]+":"+d[1]+":"+d[2];
            }
        }else{
            if (s.contains("AM")) {
                return "00:"+d[1]+":"+d[2];
            }else{
                return d[0]+":"+d[1]+":"+d[2];
            }
        }
        if (d[2].contains("AM")) {
            if ("12".equals(d[0])) {
                return "00:" + sl;
            } else {
                return s.substring(0, s.length() - 2);
            }
        } else {
            if (hh == 12) {
                return "12:00:00";
            } else {
                return (hh +12) + sl;
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        //birthdayCakeCandles
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(birthdayCakeCandles(arr));
        */
        //timeConversion 12 Hours to 24 Hours
        // System.out.println(timeConversion(sc.nextLine()));
    }
}

