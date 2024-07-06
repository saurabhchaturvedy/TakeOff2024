package BackToBasics.MSOA;

import java.util.HashSet;
import java.util.Set;

public class CourierProblem {


    public int courier(int[] arr) {

        int ans = 0;
        int index = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= arr.length; i++) {

            if (i == arr[index]) {
                index++;
            } else {

                if (set.contains(arr[index])) {

                    set.remove(arr[index++]);
                }
            }

            set.add(i);
            ans = Math.max(ans, set.size());
        }

        return ans;
    }


    int courier2(int[] arr){
        int n = arr.length, ans = 0, idx = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= n; i++){
            if(i == arr[idx]) idx++;
            else{
                if(set.contains(arr[idx])){
                    set.remove(arr[idx++]);
                }
                set.add(i);
                ans = Math.max(ans, set.size());
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        CourierProblem courierProblem = new CourierProblem();

        int[]arr = {3,2,4,5,1};

        System.out.println(courierProblem.courier2(arr));
    }
}
