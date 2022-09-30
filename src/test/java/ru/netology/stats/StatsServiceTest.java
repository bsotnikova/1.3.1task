package ru.netology.stats;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StatsServiceTest {
    StatsService service;

    @BeforeAll
    void beforeAll() {
        service = new StatsService();
    }

    @org.junit.jupiter.api.Test
    void SumSaleTest() {
        int[] purchases = {8, 15, 13, 15, 9};
        int expected = 60;
        int actual = service.sumSale(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void SumAverageTest() {
        int[] purchases = {8, 15, 13, 15};
        double expected = 12.75;
        double actual = service.sumSaleAverage(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void MaxSumTest() {
        int[] sales = {8, 13, 15, 8, 15};
        int expected = 5;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void MinSumTest() {
        int[] sales = {8, 15, 13, 8, 3};
        int expected = 4;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMinSaleAverageTest() {
        int[] purchases = {8, 15, 13, 8, 3};
        int expected = 3;
        int actual = service.sumMinSaleAverage(purchases);
        assertEquals(expected, actual);

    }
        @org.junit.jupiter.api.Test
        void sumMaxSaleAverageTest() {
        int[] purchases = {8, 15, 13, 8, 3};
        int expected = 3;
        int actual = service.sumMaxSaleAverage(purchases);
        assertEquals(expected, actual);

    }
}
