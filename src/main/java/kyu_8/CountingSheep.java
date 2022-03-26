package main.java.kyu_8;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, null, false, true,
                true, true, true, true,
                false, false, true, true};

        CountingSheep countingSheep = new CountingSheep();
        System.out.print(countingSheep.countSheeps(array1));
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            System.out.println(arrayOfSheeps[i]);
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}