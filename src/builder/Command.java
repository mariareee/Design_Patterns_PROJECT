package builder;

/* "Product" */
public class Command {
    private String sandwich = "";
    private String potatoe = "";
    private String dessert = "";
    private String drink = "";
    private String salad = "";

    public String getSandwich() {
        return sandwich;
    }

    public void setSandwich(String sandwich) {
        this.sandwich = sandwich;
    }

    public String getPotatoe() {
        return potatoe;
    }

    public void setPotatoe(String potatoe) {
        this.potatoe = potatoe;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return "\n sandwich =  "+ sandwich +
                "\n potatoe =  " + potatoe +
                "\n dessert =  " + dessert +
                "\n drink =  " + drink +
                "\n salad =  " +salad;

    }

}