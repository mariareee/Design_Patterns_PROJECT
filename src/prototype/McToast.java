package prototype;

public class McToast extends Product {
    private Spice sandwich;
    private Spice cartofiPai;
    private Spice batura;
    private Bonus bonus;

    public Spice getSandwich() {
        return sandwich;
    }

    public void setSandwich(Spice sandwich) {
        this.sandwich = sandwich;
    }

    public Spice getCartofiPai() {
        return cartofiPai;
    }

    public void setCartofiPai(Spice cartofiPai) {
        this.cartofiPai = cartofiPai;
    }

    public Spice getBatura() {
        return batura;
    }

    public void setBatura(Spice batura) {
        this.batura = batura;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}