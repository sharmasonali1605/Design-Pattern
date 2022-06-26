package Observer;

public interface Subject {

     public void registerUser(Observer observer);
     public void unregisterUser(Observer observer);
     public void notifyUser(Message message);
}
