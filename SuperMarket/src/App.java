import Classes.Market;
import Classes.PromotionalClient;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour item1 = new PromotionalClient("Ivan");
        iActorBehaviour item2 = new SpecialClient("Sergey", 3366);
        iActorBehaviour item3 = new PromotionalClient("Mihail");
        iActorBehaviour item4 = new OrdinaryClient("Aleksandr");
        iActorBehaviour item5 = new OrdinaryClient("Nataliy");
        iActorBehaviour item6 = new OrdinaryClient("Elena");
        iActorBehaviour item7 = new OrdinaryClient("Varvara");
        iActorBehaviour item8 = new OrdinaryClient("Ekaterina");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
        market.acceptToMarket(item8);
    
        market.update();

    }
}