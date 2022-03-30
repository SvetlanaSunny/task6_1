package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumOfAllASales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumOfAllASales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void middleSumSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.middleSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void peakSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.peakSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void belowAverageNumberOfMonths() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowAverageNumberOfMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void underAverageNumberOfMonths() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.underAverageNumberOfMonths(sales);
        assertEquals(expected, actual);
    }

}