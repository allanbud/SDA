package observer;

public class ObserverDesignPattern {
    //Participants of this design pattern:
    //1. Abstract interface/class Subject
    //2. Concrete/Specialized subject;
    //3. Abstract interface/class Observer
    //4. Concrete/specialized observer
    public static void main(String[] args) {
        MessageSubscriberOne subscriber1 = new MessageSubscriberOne(); //John
        MessageSubscriberTwo subscriber2 = new MessageSubscriberTwo(); //Tommy
        MessageSubscriberThree subscriber3 = new MessageSubscriberThree(); //Jeniffer
        MessagePublisher publisher = new MessagePublisher(); //Giorgi's YouTube Channel

        publisher.add(subscriber1);
        publisher.add(subscriber2);
        publisher.add(subscriber3);

        publisher.notifyUpdate(new Message("Notification: Weather will be worse in Tallinn soon!"));
        publisher.notifyUpdate(new Message("Notification: Seems like Earth is not flat!"));
        publisher.remove(subscriber2);
        publisher.notifyUpdate(new Message("Notification: You've won the 50% discount!"));
        publisher.remove(subscriber1);
        publisher.notifyUpdate(new Message("Notification: You've won the 75% discount!"));
        publisher.notifyUpdate(new MMS("Hi, MMS HERE!"));
    }
}
interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyUpdate(Message message);
}
interface Observer {
    void update(Message message);
}
class Message {
    String message;
    public Message(String message) {
        this.message=message;
    }
    public String getMessage() {
        return this.message;
    }
}
class MMS extends Message {
    public MMS(String message) {
        super(message);
    }
}