package leeetcode;

import java.util.Arrays;

public class leetcode2469 {
    public static void main(String[] args) {
        double c = 36.50;
        System.out.println(Arrays.toString(convertTemperature(c)));
    }
    public static double[] convertTemperature(double celsius) {
        double K = celsius+273.15;
        double F = celsius*1.80+32;
        double[] c = {K, F};
        return c;
    }
}

