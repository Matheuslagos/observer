public class App {
    public static void main(String[] args) throws Exception {
        EventManager eventManager = new EventManager();

        EventObserver emailNotifier = new EmailNotifier();
        EventObserver pushNotifier = new PushNotifier();


        eventManager.addObserver(emailNotifier);
        eventManager.addObserver(pushNotifier);

        eventManager.notifyObservers("Novo evento!");
        eventManager.notifyObservers("Outro evento!");

        eventManager.removeObserver(pushNotifier);

        eventManager.notifyObservers("Mais um evento!");
    }
}
