package Classes;

public class SpecialClient extends Actor {

    private int vipID;

    public SpecialClient(String name, int id) {
        super(name);
        this.vipID = id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getVipID() {
        return this.vipID;
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