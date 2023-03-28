package pz;
public class EmailMessageServiceInjectorImp implements MessageServiceInjector {
    @Override
    public MessageServiceConsumer getMessageServiceConsumer() {
        return new MessageServiceConsumerImp(new EmailServiceImp());
    }
}
