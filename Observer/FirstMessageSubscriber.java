package Observer;

public class FirstMessageSubscriber implements Observer {
    @Override
    public void updateObserver(Message message) {
            System.out.println("message  for first subscriber is "+ message.getMessage());
    }
}
