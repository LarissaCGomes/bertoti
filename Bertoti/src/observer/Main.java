package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.notifyObservers("Event 1: System initialized.");

        subject.removeObserver(observer2);

        subject.notifyObservers("Event 2: Observer 2 has been removed.");

        subject.notifyObservers("Event 3: Final update.");
    }
}
