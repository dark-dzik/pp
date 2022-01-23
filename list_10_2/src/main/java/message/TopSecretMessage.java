package message;

public class TopSecretMessage extends EncryptedMessage {

    public TopSecretMessage(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return "TopSecretMessage {" + getContent() + "}";
    }
}
