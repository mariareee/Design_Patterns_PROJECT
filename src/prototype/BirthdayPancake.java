package prototype;

public class BirthdayPancake extends Product {
    private Ingredient secretMixture;
    private Ingredient syrop;
    private Ingredient sprinkles;
    private Ingredient strawberries;

    public Ingredient getSecretMixture() {
        return secretMixture;
    }

    public void setSecretMixture(Ingredient secretMixture) {
        this.secretMixture = secretMixture;
    }

    public Ingredient getSyrop() {
        return syrop;
    }

    public void setSyrop(Ingredient syrop) {
        this.syrop = syrop;
    }

    public Ingredient getSprinkles() {
        return sprinkles;
    }

    public void setSprinkles(Ingredient sprinkles) {
        this.sprinkles = sprinkles;
    }

    public Ingredient getStrawberries() {
        return strawberries;
    }

    public void setStrawberries(Ingredient strawberries) {
        this.strawberries = strawberries;
    }
}
