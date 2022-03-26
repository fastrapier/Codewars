package main.java.kyu_7;

public class GoingToTheCinema {
    public static void main(String[] args) {
        System.out.println(movie(0, 10, 0.95));
        System.out.println(movie(500, 15, 0.9));
        System.out.println(movie(100, 10, 0.95));
    }

    //Мое тупое решение
    public static int movie(int card, int ticket, double perc) {
        double systemA = ticket;
        double systemB = card;
        int count = 1;
        double priceB = ticket * perc;
        systemB += priceB;
        System.out.println(systemA);
        System.out.println(Math.ceil(systemB));
        while (Math.ceil(systemB) >= systemA) {
            systemA += ticket;
            priceB *= perc;
            systemB += priceB;
            count++;
        }
        return count;
    }
//Миниатюрное решение и прикольное,не додумался
    public static int movie1(int card, int ticket, double perc) {
        int count = 0;
        double totalB = card;

        while (ticket * count <= Math.ceil(totalB)) totalB += ticket * Math.pow(perc, ++count);
        return count;
    }

}

