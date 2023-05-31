package Template;

public class LineMenuTemplate extends MenuTemplate{
    @Override
    public void showProductsImage() {
        System.out.println("the images are displayed in form of lines");
    };
    @Override
    public void showProductsName() {
        System.out.println("the name of the products are displayed near the image");
    };
}