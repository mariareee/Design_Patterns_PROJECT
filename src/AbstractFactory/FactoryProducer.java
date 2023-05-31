package AbstractFactory;
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Cheesecake")){
            return new CheesecakeFactory();
        }
        return null;
    }
}