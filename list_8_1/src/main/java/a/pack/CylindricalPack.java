package a.pack;

public class CylindricalPack extends Pack {

    private double radius;

    private double height;

    public CylindricalPack(String content, double radius, double height) {
        this.content = content;
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * Math.pow(radius, 2.0) * Math.PI + 2 * Math.PI * radius * height;
    }

    @Override
    public String toString() {
        return "CylindricalPack{" +
                "radius=" + radius +
                ", height=" + height +
                ", content='" + content + '\'' +
                '}';
    }
}
