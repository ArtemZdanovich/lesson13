package PhoneStore;

interface SeasonPrice {
    double result(double x, double y);
}
public class Phone {
    private String name;
    private int price;
    public Phone(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public double getDiscount(int discount, SeasonPrice func) {
        return func.result(discount, price);
    }
    public double getSeasonDiscount(String season) {
        switch (season){
            case "winter":
                return getDiscount(10,(discount, fullPrice)->{
                    return fullPrice-(fullPrice*discount/100);
                });
            case "spring":
                return getDiscount(20,(discount, fullPrice)->{
                    return fullPrice-(fullPrice*discount/100);
                });
            case "summer":
                return getDiscount(30,(discount, fullPrice)->{
                    return fullPrice-(fullPrice*discount/100);
                });
            case "fall":
                return getDiscount(40,(discount, fullPrice)->{
                    return fullPrice-(fullPrice*discount/100);
                });
            default:
                return price;

        }
    }
}
