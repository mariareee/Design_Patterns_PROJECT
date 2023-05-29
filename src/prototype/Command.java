package prototype;

import java.util.ArrayList;

public class Command implements Prototype {
    public enum CommandType {Light, Heavy, Special}

    private CommandType type;
    private ArrayList<Product> products = new ArrayList<>();
    private float totalPrice = 0;

    public Command(){}

    public Command(Command command){
        this.products = command.getProducts();
        this.totalPrice = command.totalPrice;
        this.type = command.type;
    }

    public float getTotalPrice(){
        return this.totalPrice;
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

    public void addProduct(Product product){
        this.products.add(product);
        totalPrice += product.getPrice();
    }

    public void removeProduct(Product product){
        for (Product prod: this.products) {
            if(prod == product){
                this.products.remove(product);
            }
        }
    }

    public CommandType getType(){
        return this.type;
    }

    public void setType(CommandType type){
        this.type = type;
    }

    @Override
    public Command clone() {
        return new Command(this);
    }
}
