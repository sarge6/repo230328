package pz;
public class SMSServiceImp implements MessageService{
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("SMS sent to '" + recipient + "' with SMS-Message:\n" + message);
    }
}
