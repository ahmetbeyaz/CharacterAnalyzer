import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lutfen max karakter sayisini giriniz");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        System.out.println("Lutfen max karakter dahilinde bir cümle giriniz");
        scanner.nextLine();
        String cumle = scanner.nextLine();

        while (cumle.length() > max) {
            System.out.println("Lutfen" + "" + max + "" + "karakterli bir sayi giriniz");
            cumle = scanner.nextLine();

        }
        sensitivity(cumle);
    }

    static void sensitivity(String cumle) {
        while (true) {
            System.out.println("Büyük/küçük harf duyarlılığı akif olsun mu? (Evet/Hayır)");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Evet")) {
                cumle = cumle.toLowerCase();
                System.out.println("Analiz etmek için bir harf girin");
                String harf = scanner.nextLine().toLowerCase();
                int count = calculate(cumle, harf);
                System.out.println("'" + harf + "' harfi cümle içinde " + count + " kez bulundu.");
                break;
            } else if (answer.equalsIgnoreCase("Hayır")) {
                System.out.println("Analiz etmek için bir harf girin");
                String harf = scanner.nextLine();
                int count = calculate(cumle, harf);
                System.out.println("'" + harf + "' harfi cümle içinde " + count + " kez bulundu.");
                break;
            } else {
                System.out.println("Lütfen 'Evet' veya 'Hayır' olarak cevap veriniz.");
            }
        }


    }

    static int calculate(String cumle, String harf) {
        int count = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.substring(i, i + 1).equals(harf)) {
                count++;
            }
        }
        return count;
    }
}