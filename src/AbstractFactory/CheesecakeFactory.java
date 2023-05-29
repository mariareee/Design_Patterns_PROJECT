package AbstractFactory;


public class CheesecakeFactory extends AbstractFactory {

    @Override
    public Cheesecake getCheesecake(String cheesecakeType) {
        if(cheesecakeType == null){
            return null;
        }
        if(cheesecakeType.equalsIgnoreCase("Mango Cheesecake")){
            return new MangoCheesecake();
        }
        if(cheesecakeType.equalsIgnoreCase("Chocolate Cheesecake")){
            return new ChocolateCheesecake();
        }
        if(cheesecakeType.equalsIgnoreCase("Classic Cheesecake")){
            return new ClassicCheesecake();
        }
        return null;
    }
}