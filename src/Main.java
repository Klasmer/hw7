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

        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i);
        }

        //В стране Y население — 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность
        //населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int death = 8;
        int birthRate = 17;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++ ) {
            totalPeople += totalPeople * birthRate / 1000 - totalPeople * death / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + totalPeople);
        }



    }
}