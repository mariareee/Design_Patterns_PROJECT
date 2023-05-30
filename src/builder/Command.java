package builder;

/* "Product" */
public class Command {
    private String cheesecake = "";
    private String biscuits = "";

    private String iceCream = "";
    private String drink = "";
    private String pavlova = "";

    public String getCheesecake() {
        return cheesecake;
    }

    public void setCheesecake(String cheesecake) {
        this.cheesecake = cheesecake;
    }

    public String getBiscuits() {
        return biscuits;
    }

    public void setBiscuits(String biscuits) {
        this.biscuits = biscuits;
    }

    public String getIceCream() {
        return iceCream;
    }

    public void setIceCream(String dessert) {
        this.iceCream = iceCream;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getPavlova() {
        return pavlova;
    }

    public void setPavlova(String pavlova) {
        this.pavlova = pavlova;
    }

    @Override
    public String toString() {
        return "\n sandwich =  "+ cheesecake +
                "\n potatoe =  " + biscuits +
                "\n dessert =  " + iceCream +
                "\n drink =  " + drink +
                "\n salad =  " +pavlova;

    }

}