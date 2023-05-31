package prototype;

public class SweetSet extends Product {
    private Ingredient waffles;
    private Ingredient crispyBacon;
    private Ingredient drink;
    private Bonus bonus;

    public Ingredient getWaffles() {
        return waffles;
    }

    public void setWaffles(Ingredient waffles) {
        this.waffles = waffles;
    }

    public Ingredient getCrispyBacon() {
        return crispyBacon;
    }

    public void setCrispyBacon(Ingredient crispyBacon) {
        this.crispyBacon = crispyBacon;
    }

    public Ingredient getDrink() {
        return drink;
    }

    public void setDrink(Ingredient drink) {
        this.drink = drink;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}