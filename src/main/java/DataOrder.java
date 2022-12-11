import java.util.List;

public class DataOrder {

    public Order dataTestCreateOrderScooterColor(List<String> color) {
        return new Order(
                "Иван",
                "Иванов",
                "Ленина 24",
                10,
                "89965474376",
                2,
                "2022-09-15",
                "4-й подъезд",
                color);
    }
}