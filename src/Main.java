public class Main {
    public static void main(String[] args) {
        // Задание 1
        int capital = 29000;
        int deposit = 0;
        int e = 0;
        while (deposit < 2_459_000) {
            deposit = deposit + deposit / 100;
            deposit += capital;
            System.out.println("Месяц " + e + ", сумма накоплений равна " + deposit + " рублей");
            e++;
        }
        // Задание 2
        int start = 1;
        while (start <= 10) {
            System.out.print(start + "   ");
            start++;
        }
        int start2 = 10;
        while (start2 > 0) {
            System.out.print(start2 + "   ");
            start2--;
        }
        // Задание 3
        int population = 12_000_000;
        double birth = (double) 17 / 1000;
        double death = (double) 8 / 1000;
        int years = 0;
        while (years < 10) {
            population = (int) (population + (population * birth) - (population * death));
            years++;
            System.out.println("  Год " + years + " ,численность населения составляет: " + population);
        }
        // Задание 4,5
        int originalCash = 15_000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total / 700;
            total = total + originalCash;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        // Задание 6
        int originalCash1 = 15_000;
        int total1 = 0;
        int z = 0;
        for (; z < 108; z++) {
            total1 = total1 + total1 / 700;
            total1 = total1 + originalCash1;
            if (z % 6 == 0) {
                System.out.println("Месяц " + z + ", сумма накоплений равна " + total1 + " рублей");
            }
        }
        // Задание 7
        for (int d = 1; d <31 ; d++ ) {
            if (d % 7 == 1)
                System.out.println("Сегодня пятница, " + d + " число. Необходимо подготовить отчет");
            ;
        }
        // Задание 8
        int pastYear = 1822;
        int futureYear1 = 2122;
        for (int r = 0; r <= futureYear1; r = r +79){
            if (r >= pastYear) {
                System.out.println(r);
            }
        }

        // Задание 9
        for (int y =1; y <=10; y++) {
            System.out.println ("2*" + y + "=" + 2*y);
          }


    }
}


