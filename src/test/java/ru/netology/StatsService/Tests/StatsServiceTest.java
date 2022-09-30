package ru.netology.StatsService.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void shouldFindBetweenMinSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindBetweenMaxSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expectedMonth = 6;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expectedAmount = 176;
        int actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }


    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expectedAverageAmount = 14;
        int actualAverageAmount = service.averageAmountSales(sales);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }


    @Test
    public void shouldFindMinAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int expectedMinAverageSales = 5;
        int actualMinAverageSales = service.minAverageSales(sales);

        Assertions.assertEquals(expectedMinAverageSales, actualMinAverageSales);
    }

}
