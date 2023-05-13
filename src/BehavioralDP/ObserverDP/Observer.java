package BehavioralDP.ObserverDP;

public class Observer {
    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.observerDemo();
    }

    void observerDemo() {
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);


        agency.sendNews("Java is  a premium development option for enterprice applications");
        agency.sendNews("Spring boot simplifies configuration.");
        agency.sendNews("Spring security provides a very secure layers.");

        System.out.println("CH1 News : ");
        channel1.printNews();
        System.out.println("***************");

        System.out.println("CH2 News : ");
        channel2.printNews();
        System.out.println("***************");

        System.out.println("CH3 News : ");
        channel3.printNews();
        System.out.println("***************");




    }

}
