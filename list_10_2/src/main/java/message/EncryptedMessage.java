package message;

public class EncryptedMessage extends PlainTextMessage {

    public EncryptedMessage(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return "EncryptedMessage {" + getContent() + "}";
    }
}
