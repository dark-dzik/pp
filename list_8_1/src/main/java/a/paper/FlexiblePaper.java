package a.paper;

import a.pack.Pack;

public class FlexiblePaper extends WrappingPaper {

    public FlexiblePaper(Pack packToWrap) {
        super(packToWrap);
    }

    @Override
    public String toString() {
        return "FlexiblePaper{" +
                "wrappedPack=" + wrappedPack +
                "} " + super.toString();
    }
}
