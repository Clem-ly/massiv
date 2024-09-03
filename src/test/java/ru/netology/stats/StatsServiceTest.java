package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void testTotalSale() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calculateTotalSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverageSale() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calculateAverageSales(sales);
        long expected = 180 / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMAxSale() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calculateGetMonthMaxSales(sales);
        long expected = 8;
    }

    @Test
    public void testMinSale() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calculateGetMonthMinSales(sales);
        long expected = 9;
    }

    @Test
    public void testMonthBellowAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calculateMonthsBellowAverage(sales);
        long expected = 5;
    }

    @Test
    public void testMonthsAboveAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = statsService.calculateMonthsAboveAverage(sales);
        long expected = 5;
    }
}