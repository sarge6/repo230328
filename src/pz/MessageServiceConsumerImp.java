package pz;
public class MessageServiceConsumerImp implements MessageServiceConsumer {
    private MessageService messageService;
    public MessageServiceConsumerImp(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessage(String recipient, String message) {
        this.messageService.sendMessage(recipient, message);
    }
}
