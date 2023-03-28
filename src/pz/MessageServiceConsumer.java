package pz;
public interface MessageServiceConsumer {
    void processMessage(String recipient, String message);
}
