package Lesson_2;
import java.util ArrayList;

public class Market implements Marketbehaviour, QueueBehavioor {
    private List<Actor> actorList = new A




    public void TakeOrder() {
        for (Actor actor : ActorList) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " got his order");
            }
        }


    
    }
}
