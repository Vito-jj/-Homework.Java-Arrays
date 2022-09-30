import ru.netology.stats.StatsService;

public class Main {


    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};
        int minAverageSales = service.minAverageSales(sales);

        System.out.println(minAverageSales);


    }


}
