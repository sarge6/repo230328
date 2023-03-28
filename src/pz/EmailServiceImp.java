package pz;
public class EmailServiceImp implements MessageService{
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("EMAIL sent to '" + recipient + "' with Email-Message:\n" + message);
    }
}
