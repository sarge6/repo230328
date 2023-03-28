package pz;
public class MessageServiceUser1 {
    public static void main(String[] args) {
        String recipient = "admin@gmx.net";
        String message = "new message!";
        //contains Email and SMS Implementations of Interface Type MessageService
        MessageService[] messageServices = {new EmailServiceImp(), new SMSServiceImp()};
        MessageService objMessageServiceEmailOrSMS = null;
        if(Math.random() <= 0.5) objMessageServiceEmailOrSMS = new EmailServiceImp();
        else objMessageServiceEmailOrSMS = new SMSServiceImp();
        MessageServiceConsumerImp objMessageServiceConsumer = new MessageServiceConsumerImp(objMessageServiceEmailOrSMS);
        objMessageServiceConsumer.processMessage(recipient, message);
    }
}
