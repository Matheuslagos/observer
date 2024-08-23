public class PushNotifier implements EventObserver {
    @Override
    public void update(String event) {
        System.out.println("PushNotifier: Enviando notificação push sobre o evento: " + event);
    }
}