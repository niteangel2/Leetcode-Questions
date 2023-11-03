import java.util.*;
public class LeetDaily03 {
        public List<String> buildArray(int[] target, int n) {
            int i = 1;
            int k = 0;
            List<String> res = new ArrayList<>();
            while(i <= n && k < target.length) {
                if(target[k] == i) {
                    res.add("Push");
                    k++;
                }
                else{
                    res.add("Push");
                    res.add("Pop");
                }
                i++;
            }
            return res;
        }
}
