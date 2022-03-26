package main.java.kyu_8;

public class DifferenceOfVolumesOfCuboids {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        int a = 1;
        int b = 1;
        for (int i = 0; i < firstCuboid.length; i++) {
            a *= firstCuboid[i];
            b *= secondCuboid[i];
        }
        return Math.abs(a - b);
//        if (a > b )
//            return a - b;
//        else
//            return b - a;

    }

}
