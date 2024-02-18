import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if (day > 31 || month > 12) {
            System.out.print("Hatalı giriş yaptınız");
            if (month == 1) {
                if (day >= 22) {
                    burc = "Kova";
                }
            }
            if (month == 2) {
                if (day <= 19) {
                    burc = "Kova";
                }
            }
            if (month == 2) {
                if (day >= 20) {
                    burc = "Balık";
                }
            }
            if (month == 3) {
                if (day <= 20) {
                    burc = "Balık";
                }
            }
            if (month == 3) {
                if (day >= 21) {
                    burc = "Koç";
                }
            }
            if (month == 4) {
                if (day <= 20) {
                    burc = "Koç";
                }
            }
            if (month == 4) {
                if (day >= 21) {
                    burc = "Boğa";
                }
            }
            if (month == 5) {
                if (day <= 21) {
                    burc = "Boğa";
                }
            }
            if (month == 5) {
                if (day >= 22) {
                    burc = "İkizler";
                }
            }
            if (month == 6) {
                if (day <= 22) {
                    burc = "İkizler";
                }
            }
            if (month == 6) {
                if (day >= 23) {
                    burc = "Yengeç";
                }
            }
            if (month == 7) {
                if (day <= 22) {
                    burc = "Yengeç";
                }
            }
            if (month == 7) {
                if (day >= 23) {
                    burc = "Aslan";
                }
            }
            if (month == 8) {
                if (day <= 22) {
                    burc = "Aslan";
                }
            }
            if (month == 8) {
                if (day >= 23) {
                    burc = "Başak";
                }
            }
            if (month == 9) {
                if (day <= 22) {
                    burc = "Başak";
                }
            }
            if (month == 9) {
                if (day >= 23) {
                    burc = "Terazi";
                }
            }
            if (month == 10) {
                if (day <= 22) {
                    burc = "Terazi";
                }
            }
            if (month == 10) {
                if (day >= 23) {
                    burc = "Akrep";
                }
            }
            if (month == 11) {
                if (day <= 21) {
                    burc = "Akrep";
                }
            }
            if (month == 11) {
                if (day >= 22) {
                    burc = "Yay";
                }
            }
            if (month == 12) {
                if (day <= 21) {
                    burc = "Yay";
                }
            }
            if (month == 12) {
                if (day >= 22) {
                    burc = "Oğlak";
                }
            }
            if (month == 1) {
                if (day <= 21) {
                    burc = "Oğlak";
                }
            }
        } else System.out.print("Burcunuz: " + burc);
    }
}