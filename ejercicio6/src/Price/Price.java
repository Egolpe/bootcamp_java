package Price;

public class Price {
    public static void main(String[] args) {
        double thisPrice = 34.50;
        double priceIVA = getPrice(thisPrice);
        System.out.println(priceIVA);
    }

    static double getPrice(double price){
        return price + price * 0.21d;
    }
}
