import lombok.extern.slf4j.Slf4j;
import message.EncryptedMessage;
import message.TopSecretMessage;

@Slf4j
public class List_10_2 {
    public static void main(String[] args) {
        Channel<? extends EncryptedMessage> encryptedMessageChannel = new Channel<TopSecretMessage>();
        Channel<? super TopSecretMessage> topSecretMessageChannel = new Channel<EncryptedMessage>();

        EncryptedMessage encryptedMessage = new EncryptedMessage("encryptedMessage");
        TopSecretMessage topSecretMessage = new TopSecretMessage("topSecredMessage");

        log.info(encryptedMessage.toString());

        //((Channel<TopSecretMessage>)encryptedMessageChannel).send(topSecretMessage);
        //encryptedMessageChannel.send(topSecretMessage);

        //topSecretMessageChannel.send(encryptedMessage);
    }
}
