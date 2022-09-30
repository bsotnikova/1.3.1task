package ru.netology.stats;

public class StatsService {
    public int sumSale(int[] purchases) {
        int sum = 0;
        for (int i = 0; i < purchases.length; i++
        ) {
            sum += purchases[i];
        }
        System.out.println(sum);
        return sum;
    }

    public double sumSaleAverage(int[] purchases) {
        double sum = sumSale(purchases);
        double average = sum / purchases.length;
        System.out.println(average);
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println(month);
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        System.out.println(minMonth);
        return minMonth + 1;
    }

    public int sumMinSaleAverage(int[] purchases) {
        double average = sumSaleAverage(purchases);
        int amount = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                amount = amount + 1;
            }
        }
        System.out.println(amount);
        return amount;
    }
    public int sumMaxSaleAverage(int[] purchases) {
        double average = sumSaleAverage(purchases);
        int amount = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                amount = amount + 1;
            }
        }
        System.out.println(amount);
        return amount;
    }

}

