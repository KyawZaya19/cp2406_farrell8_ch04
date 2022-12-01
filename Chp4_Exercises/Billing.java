public class Billing
{
    final static double TAX = 0.08;
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(20.79);
        System.out.println("The total for a photobook that costs $20.79 is $" + bill);
        bill = computeBill(14.50, 5);
        System.out.println("The total for five photobooks that cost $14.50 is $" + bill);
        bill = computeBill(12.00, 8, 25.00);
        System.out.println("The total for eight photobooks that cost $12.00 with a $25 coupon is $" + bill);
    }

    public static double computeBill(double price)
    {
        double bill = price + price * TAX;
        return bill;
    }

    public static double computeBill(double price, int quantity)
    {
        double bill = price * quantity;
        bill = bill + bill * TAX;
        return bill;
    }

    public static double computeBill(double price, int quantity, double coupon)
    {
        double bill = price * quantity;
        bill = bill - coupon;
        bill = bill + bill * TAX;
        return bill;
    }
}
