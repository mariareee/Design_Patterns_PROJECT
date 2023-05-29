package Template;

public class GridMenuTemplate extends MenuTemplate{
    @Override
    public void showProductsImage() {
        System.out.println("the images are displayed in form of a grid");
    };

    @Override
    public void showProductsName() {
        System.out.println("the name of the products are displayed below the image");
    };

}