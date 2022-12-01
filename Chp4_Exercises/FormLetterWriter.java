public class FormLetterWriter
{
    public static void main(String[] args)
    {
        displaySalutation("Teddy");
        displayLetter();
        displaySalutation("Teddy", "Bear");
        displayLetter();
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms." + lastName + ",");
    }

    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }

    public static void displayLetter()
    {
        System.out.println("  Thank you for your recent order.\n");
    }

}
