public class Main {
    public static void main(String[] args) {
        double startCount = 100;
        double transfer = 1523;
        double total = startCount + transfer;
        int bonus = 0;
        if (transfer > 1000) {
            bonus = (int)(transfer / 100);
            total = total + bonus;
        }
        System.out.println("Итоговый счёт: " + total + " руб.");
        System.out.println("Бонус: " + bonus + " руб.");
    }
}
