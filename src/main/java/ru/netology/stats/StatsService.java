package ru.netology.stats;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long calculateAverageSales(long[] sales) {
        return calculateTotalSales(sales) / sales.length;
    }

    public int calculateGetMonthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;

            }
        }
        return monthMax + 1;
    }

    public int calculateGetMonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;

            }
        }
        return monthMin + 1;
    }

    public int calculateMonthsBellowAverage(long[] sales) {
        int counter = 0;
        long averageSales = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSales = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}