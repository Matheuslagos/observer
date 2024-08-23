public class EmailNotifier implements EventObserver {
    @Override
    public void update(String event) {
        System.out.println("EmailNotifier: Enviando email sobre o evento: " + event);
    }
}