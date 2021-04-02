public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int min = arr[0].length();
        for (int i = 0; i < arr.length ; i++) {
            min= Math.min(min, arr[i].length());
        }
        return min;
    }
}
