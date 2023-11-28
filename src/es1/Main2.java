package es1;

public class Main2 {
    public static void main(String[] args) {
        boolean bisestile = annoBisestile(2096);
        boolean nonBisestile = annoBisestile(2095);

        System.out.println("2096 è un anno bisestile? " + bisestile + " 2095 è un anno bisestile? " + nonBisestile);
    }

    public static boolean annoBisestile(int year) {
        if(year % 4 == 0) {
            return true;
        }
        return false;
    }
}
