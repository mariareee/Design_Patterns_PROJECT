package Template;

public abstract class MenuTemplate {
    public boolean isLine;
    public boolean isGrid;
    public abstract void showProductsImage();
    public abstract void showProductsName();
    public final void showProductsDetails() {
        System.out.println("the product details");
    };
    public final void chooseLine()
    {
        try
        {
            System.out.println("Set to line successfully");
        }
        catch (Exception e)
        {
            System.out.println("Set to line unsuccessful");
        }
    }

    public final void chooseGrid()
    {
        try
        {
            System.out.println("Set to grid successfully");
        }
        catch (Exception e)
        {
            System.out.println("Set to grid unsuccessful");
        }
    }
    public final void chooseMenuTemplate(boolean typeLineMenu, boolean typeGridMenu) {
        if (typeLineMenu) {
            chooseLine();
            showProductsImage();
            showProductsName();

            showProductsDetails();
        } else if (typeGridMenu) {
            chooseGrid();
            showProductsImage();
            showProductsName();
        }

    }
}
