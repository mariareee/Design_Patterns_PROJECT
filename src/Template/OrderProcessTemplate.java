package Template;


public abstract class OrderProcessTemplate
{
    public boolean isOrder;

    public abstract void doSelect();

    public abstract void doPayment();

    public final void orderWrap()
    {
        try
        {
            System.out.println("Order done successfull");
        }
        catch (Exception e)
        {
            System.out.println("Order done unsuccessful");
        }
    }

    public abstract void doDelivery();

    public final void processOrder(boolean isOrder)
    {
        doSelect();
        doPayment();
        if (isOrder) {
            orderWrap();
        }
        doDelivery();
    }
}







