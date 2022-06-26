package Observer;

public class SecondMessageSubscriber implements Observer {

    @Override
    public void updateObserver(Message message) {
        System.out.println("message for second subscriber is "+ message.getMessage());
    }

}
