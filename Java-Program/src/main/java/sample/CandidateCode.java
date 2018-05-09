package sample;

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        int[] arr = new int[4];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<4; i++){
            arr[i] = scan.nextInt();
        }
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> point = new ArrayList<>();
        List<Integer> endPoint = new ArrayList<>();
        for(int i=0; i<3; i++){
            endPoint.clear();
            for(int j=0; j<4; j++){
                endPoint.add(scan.nextInt());
            }
            point.add(CandidateCode.output(arr, endPoint));
        }
        Collections.sort(point);
        System.out.println(point.get(0));
    }

    private static Integer output(int[] arr, List<Integer> point){
        int sum =0;
        for(int i =0; i< point.size(); i++){
            sum = sum +  Math.abs(point.get(i)-arr[i]);
        }
        return sum+10;
    }
}
