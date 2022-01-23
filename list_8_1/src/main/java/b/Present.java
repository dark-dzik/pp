package b;

import java.util.Arrays;

public class Present {

    private String content;

    private PackType packType;

    private double[] dimensions;

    /**
     * Constructor.
     * @param content
     * @param packType
     * @param dimensions Depending on {@link PackType} at different indices are held different values of dimensions:
     *                   <ul>
     *                   <li>{@link PackType#CUBOID}:<br> width - dimensions[0]<br> length - dimensions[1]<br> height - dimensions[2]</li>
     *                   <li>{@link PackType#CYLINDRICAL}:<br> radius - dimensions[0];<br> height - dimensions[1]</li>
     *                   <li>{@link PackType#SPHERE}:<br> radius - dimensions[0]</li>
     *                   </ul>
     */
    public Present(String content, PackType packType, double[] dimensions) {
        this.content = content;
        this.packType = packType;
        this.dimensions = dimensions;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PackType getPackType() {
        return packType;
    }

    public void setPackType(PackType packType) {
        this.packType = packType;
    }

    public double[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(double[] dimensions) {
        this.dimensions = dimensions;
    }

    public double calculateSurfaceArea() {
        switch (packType) {
            case CUBOID:
                return calculateSurfaceAreaOfCuboid();
            case CYLINDRICAL:
                return calculateSurfaceAreaOfCylinder();
            case SPHERE:
                return calculateSurfaceAreaOfSphere();
            default:
                return 0;
        }
    }

    private double calculateSurfaceAreaOfCuboid() {
        return 2 * dimensions[0] * dimensions[1] + 2 * dimensions[0] * dimensions[2] + 2 * dimensions[1] * dimensions[2];
    }

    private double calculateSurfaceAreaOfCylinder() {
        return 2 * Math.pow(dimensions[0], 2.0) * Math.PI + 2 * Math.PI * dimensions[0] * dimensions[1];
    }

    private double calculateSurfaceAreaOfSphere() {
        return 4 * Math.PI * Math.pow(dimensions[0], 2.0);
    }

    @Override
    public String toString() {
        return "Present{" +
                "content='" + content + '\'' +
                ", packType=" + packType +
                ", dimensions=" + Arrays.toString(dimensions) +
                '}';
    }
}
