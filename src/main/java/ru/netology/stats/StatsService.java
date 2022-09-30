package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountSales(long[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return amount;
    }


    public int averageAmountSales(long[] sales) {
        int amount = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        average = amount / sales.length;
        return average;
    }


    public int minAverageSales(long[] sales) {
        int averageAmount = averageAmountSales(sales);
        int mounthNumber = 0;
        int mounthMinAverage = 0;

        for (int i = mounthNumber; i < sales.length; i++) {
            if (sales[i] <= sales[averageAmount]) {
                mounthMinAverage = mounthNumber + 1;
            }
        }
        return mounthMinAverage;
    }


    

}
