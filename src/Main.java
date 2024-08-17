public class Main {
    public static void main(String[] args) {
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        System.out.println("Задача 1");
        int total = 0;
        int savingsPerMonth = 15_000;
        int month = 0;
        int bank = 2_459_000;
        while (total < bank) {
            total = total + savingsPerMonth;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений = " + total + " рублей");
        }

    }
}