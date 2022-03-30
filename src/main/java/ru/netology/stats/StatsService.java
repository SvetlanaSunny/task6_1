package ru.netology.stats;

public class StatsService {
    public int sumOfAllASales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int middleSumSales(int[] sales) {
        int middleSum = sumOfAllASales(sales) / sales.length;
        return middleSum;
    }

    public int peakSales(int[] sales) {
        int summMomth = 0;
        int numberMomth = 0;
        for (int i = 0; i < 12; i++) {
            if (summMomth <= sales[i]) {
                summMomth = sales[i];
                numberMomth = i + 1;
            }
        }
        return numberMomth;
    }

    public int minSales(int[] sales) {
        int summMin = sales[0];
        int numberMomth = 0;
        for (int i = 0; i < 12; i++) {
            if (summMin >= sales[i]) {
                summMin = sales[i];
                numberMomth = i + 1;
            }
        }
        return numberMomth;
    }

    public int belowAverageNumberOfMonths(int[] sales) { // Кол-во месяцев, в которых продажи были ниже среднего
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale < middleSumSales(sales)) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }

    public int underAverageNumberOfMonths(int[] sales) { // Кол-во месяцев, в которых продажи были ниже среднего
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale > middleSumSales(sales)) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }
}

