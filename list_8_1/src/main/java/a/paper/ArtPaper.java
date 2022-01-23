package a.paper;

import a.pack.Pack;

public class ArtPaper extends WrappingPaper {

    public ArtPaper(Pack packToWrap) {
        super(packToWrap);
    }

    @Override
    public String toString() {
        return "ArtPaper{" +
                "wrappedPack=" + wrappedPack +
                "} " + super.toString();
    }
}
