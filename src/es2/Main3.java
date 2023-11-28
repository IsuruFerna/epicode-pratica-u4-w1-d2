package es2;

public class Main3 {
    public static void main(String[] args) {
        String compreso = caseSwitch(2);
        String nonCompreso = caseSwitch(4);

        System.out.println(compreso);
        System.out.println(nonCompreso);
    }

    public static String caseSwitch(int num) {
        String str = " è compreso tra 0 e 3";
        switch (num) {
            case 0:
                return num + str;

            case 1:
                return num + str;

            case 2:
                return num + str;

            case 3:
                return num + str;

            default:
                return num + " non compreso tra 0 e 3";
        }
    }
}
