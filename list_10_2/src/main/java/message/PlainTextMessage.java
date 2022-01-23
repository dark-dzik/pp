package message;

public class PlainTextMessage {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PlainTextMessage(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PlainTextMessage {" + content + "}";
    }
}
