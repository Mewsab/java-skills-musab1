public class ShoppingCart {
    public static double calculateTotal(double[] prices, String customerType) {
        double total = 0;

        for (double price : prices){
            total += price;
        }
        switch(customerType){
            case "PREMIUM":
                System.out.println("10% discount");
                return total * 0.9;
            case "VIP":
                System.out.println("20% discount");
                return total * 0.8;
            case "REGULAR":
                System.out.println("No discount");
                return total;
            default:
                System.out.println("Could not find customer type, please try again");
        }
        return total;

    }
    public static double findMostExpensive(double[] prices){
        if (prices.length == 0) {
            return 0;
        }
        double max = prices[0];
        for (double price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    public static int countExpensiveItems(double[] prices, double pricePoint){
        int count = 0;
        for (double price: prices){
            if (price > pricePoint) {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args){
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};

        System.out.println("Regular customer total: $" + calculateTotal(cart, "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart, "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart, "VIP"));

        System.out.println("Most expensive item is: $" + findMostExpensive(cart));
        System.out.println("Items over 35$ price point: $" + countExpensiveItems(cart, 35.0));

    }




}
