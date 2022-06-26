package Observer;

public class Main {

    public static void main(String[] args) {
           FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
           SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
           MessageInterface messageInterface = new MessageInterface();
           messageInterface.registerUser(firstMessageSubscriber);
           messageInterface.registerUser(secondMessageSubscriber);
           messageInterface.notifyUser(new Message("I am subscribed to a message"));
           messageInterface.unregisterUser(firstMessageSubscriber);
           messageInterface.notifyUser(new Message("this message is inteneded only for subscribers"));
    }
}
