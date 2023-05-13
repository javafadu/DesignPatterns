package BehavioralDP.MediatorDP;

public class MediatorRunner {

    public static void main(String[] args) {

        MediatorRunner mediator = new MediatorRunner();
        mediator.mediatorDemor();

    }

    void mediatorDemor() {
       MessageDispatcher dispatcher = new MessageDispatcher();
       Actor actor1 = new MessageActor("Actor1", dispatcher);
       Actor actor2 = new MessageActor("Actor2", dispatcher);
       Actor actor3 = new MessageActor("Actor3", dispatcher);
       Actor actor4 = new MessageActor("Actor4", dispatcher);


       dispatcher.register("topic1",actor1);
       dispatcher.register("topic2",actor2);
       dispatcher.register("topic3",actor3);
       dispatcher.register("topic4",actor4);


       actor1.sendMessage("topic2","message for topic2");
       actor1.sendMessage("topic3","message for topic3");
       actor1.sendMessage("topic4","message for topic4");

    }


}
