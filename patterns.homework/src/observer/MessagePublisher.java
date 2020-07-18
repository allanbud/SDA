package observer;

import java.util.ArrayList;
import java.util.List;
public class MessagePublisher implements Subject {
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyUpdate(Message message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}