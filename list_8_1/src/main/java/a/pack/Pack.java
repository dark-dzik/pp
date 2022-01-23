package a.pack;

public abstract class Pack {

    protected String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract double calculateSurfaceArea();

    @Override
    public String toString() {
        return "Pack{" +
                "content='" + content + '\'' +
                '}';
    }
}
