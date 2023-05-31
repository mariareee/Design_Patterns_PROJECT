package Template;

public class LocalOrder extends OrderProcessTemplate
{
    @Override
    public void doSelect()
    {
        System.out.println("Customer chooses the item from menu at MC.");
    }
    @Override
    public void doPayment()
    {
        System.out.println("Pays at counter through cash/POS");
    }
    @Override
    public void doDelivery()
    {
        System.out.println("No delivery is required");
    }

}