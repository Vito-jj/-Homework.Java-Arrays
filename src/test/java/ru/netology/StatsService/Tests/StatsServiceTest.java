package ru.netology.StatsService.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void shouldFindBetweenMinSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindBetweenMaxSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expected = 6;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        long actual = service.amountSales(sales);
        long expected = 176;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        long actual = service.averageAmountSales(sales);
        long expected = 14;


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMinAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int actual = service.minAverageSales(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int actual = service.maxAverageSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

}
