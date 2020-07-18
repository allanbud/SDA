package observer;

class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber one received: "+message.getMessage());
    }
}
class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber two received: "+message.getMessage());
    }
}
class MessageSubscriberThree implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber three received: "+message.getMessage());
    }
}