package Classes;

public class PromotionalClient extends Actor {
    private String promoLine;

    public PromotionalClient(String name) {
        super(name);
        this.promoLine = getCurrentPromoLine();
    }

    public String getCurrentPromoLine() {
        return "Sale = 1000%";
    }

    @Override
    public String getName() {
        return super.name;
    }

    public String getPromoLine() {
        return this.promoLine;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean tookOrder) {
        super.isTakeOrder = tookOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }
    
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;        
    }
}