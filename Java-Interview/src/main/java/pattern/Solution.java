package pattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    // Complete the countSubSequence function below.
    static int countSubSequence(List<Integer> inputSeq, int targetSum) {

        int ans = 0;
        int n = inputSeq.size();
        for (int i = 0; i < (1 << n); i++) {
            Integer count = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++){

                if ((i & (1 << j)) > 0){
                    count += inputSeq.get(j);
                }
            }
            System.out.println(list +"==>"+list.stream().mapToInt(e -> e.intValue()).filter(o -> o == targetSum)
            .sum());
            if (targetSum == count) ans++;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> inputSeq = new ArrayList<>();
        inputSeq.add(4);
        inputSeq.add(2);
        inputSeq.add(6);
        inputSeq.add(1);
        inputSeq.add(5);
        System.out.println(countSubSequence(inputSeq, 6));
    }
}
