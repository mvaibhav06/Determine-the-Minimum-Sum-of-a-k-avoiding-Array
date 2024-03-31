import java.util.ArrayList;
import java.util.List;

public class MinimumSum {
    public static int minimumSum(int n, int k) {
        int sum = 0;
        List<Integer> temp = new ArrayList<>();

        int i = 1;

        while(temp.size() < n){
            if(temp.contains(k-i)){
                while(temp.contains(k-i)){
                    i++;
                }
                temp.add(i);
                sum += i;
                i++;
            }else{
                sum += i;
                temp.add(i);
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(3,5));
    }
}
