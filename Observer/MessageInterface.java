package Observer;

import java.util.ArrayList;
import java.util.List;

public class MessageInterface implements Subject {

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerUser(Observer observer) {
           observerList.add(observer);
    }

    @Override
    public void unregisterUser(Observer observer) {
                observerList.remove(observer);
    }

    @Override
    public void notifyUser(Message message) {
           for(Observer observer1 : observerList){
               observer1.updateObserver(message);
           }
    }

}
