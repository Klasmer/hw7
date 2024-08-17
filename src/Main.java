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
        for (int year = currentYear; year < currentYear + 10; year++) {
            totalPeople += totalPeople * birthRate / 1000 - totalPeople * death / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + totalPeople);
        }

        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        //Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы
        //собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений
        //собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений
        System.out.println("Задача 4");
        int summ = 12_000_000;
        int contribution = 15_000;
        double percent = 7D / 100;
        month = 0;
        while (contribution < summ) {
            contribution = (int) (contribution * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " сумма накоплений = " + contribution + " рублей");
        }

        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы
        //подряд, а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        System.out.println("Задача 5");
        int summ1 = 12_000_000;
        int contribution1 = 15_000;
        double percent1 = 7D / 100;
        month = 0;
        while (contribution1 < summ1) {
            contribution1 = (int) (contribution1 * (1 + percent1));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений = " + contribution1 + " рублей");
            }

        }

        //Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет
        //сумма его накоплений каждые полгода на протяжении этих 9 лет.
        //Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
        System.out.println("Задача 6");
        int contribution2 = 15_000;
        double percent2 = 7D / 100;
        int months = 12 * 9;
        month = 0;
        while (month < months) {
            contribution2 = (int) (contribution2 * (1 + percent2));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений = " + contribution2 + " рублей");
            }
        }
    }
}