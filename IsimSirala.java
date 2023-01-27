import java.util.Scanner;

public class IsimSirala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] isimler = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Isim " + (i + 1) + ": ");
            isimler[i] = sc.nextLine();
        }
        isimSirala(isimler);
        System.out.println("Alfabetik Olarak Siralanmis Isimler:");
        for (String isim : isimler) {
            System.out.println(isim);
        }
    }

    public static void isimSirala(String[] isimler) {
        for (int i = 0; i < isimler.length; i++) {
            for (int j = i + 1; j < isimler.length; j++) {
                if (isimler[i].compareTo(isimler[j]) > 0) {
                    String temp = isimler[i];
                    isimler[i] = isimler[j];
                    isimler[j] = temp;
                }
            }
        }
    }
}
