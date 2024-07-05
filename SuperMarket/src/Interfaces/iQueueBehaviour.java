package Interfaces;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void makeOrder();
    void takeOrder();
}