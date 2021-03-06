package interaction

interface Subscriber {
    void receive(String message) throws Exception
}

class Publisher {
    List<Subscriber> subscribers = []

    void publish(String message) {
        for (subscriber in subscribers) {
            try {
                subscriber.receive(message)
            } catch (Exception ignored) {}
        }
    }
}