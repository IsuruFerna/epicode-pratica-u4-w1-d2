package es1;

public class Main1 {
    public static void main(String[] args) {
        boolean pari = pariDispari("42");
        boolean dispari = pariDispari("23");

        System.out.println("pari 42? " + pari + " pari 23? " + dispari);
    }
    public static boolean pariDispari(String num) {
        int number = Integer.parseInt(num);
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
