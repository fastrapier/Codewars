public class WriteNumberInExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(74));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(50012));
        System.out.println(expandedForm(9000000));
    }

    public static String expandedForm(int num) {
        String str = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        int countOfZeros = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                stringBuilder.append(str.charAt(i));
                    //stringBuilder.append("0".repeat(countOfZeros));
                    stringBuilder.append(" + ");

            }
            countOfZeros--;
        }
        stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
        return String.valueOf(stringBuilder);
    }
}
