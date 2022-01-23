package b.paper;

import b.Present;

public class ArtPaper extends WrappingPaper {

    public ArtPaper(Present packToWrap) {
        this.wrappedPresent = packToWrap;
    }

    @Override
    public String toString() {
        return "ArtPaper{" +
                "wrappedPack=" + wrappedPresent +
                "} " + super.toString();
    }
}
