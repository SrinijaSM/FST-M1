package Activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args)
    {
        int[] arry_nums = {10, 77, 10, 54, -11, 10};
        System.out.println("ArrayList values are = "+ Arrays.toString(arry_nums));

        int serch_num = 10;
        int sum_num=30;

        System.out.println("Search Num is "+serch_num);
        System.out.println("Sum Num is "+sum_num);
        System.out.println("Result: " + func(arry_nums, serch_num, sum_num));
    }

    public static boolean func(int[] arry, int serch_num, int sum_num)
    {
        int Temp_sum = 0;
        for (int x : arry) {
            if (x == serch_num) {
                Temp_sum = Temp_sum + x;
            }
            if (Temp_sum > sum_num) {
                break;
            }
        }
        return Temp_sum == sum_num;
    }

}
