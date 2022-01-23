package a.paper;

import a.pack.Pack;

public abstract class WrappingPaper {

    protected Pack wrappedPack;

    public Pack getWrappedPack() {
        return wrappedPack;
    }

    public void setWrappedPack(Pack wrappedPack) {
        this.wrappedPack = wrappedPack;
    }

    protected WrappingPaper(Pack wrappedPack) {
        this.wrappedPack = wrappedPack;
    }

    public WrappingPaper wrapPack(Pack packToWrap) {
        this.wrappedPack = packToWrap;
        return this;
    }

    @Override
    public String toString() {
        return "WrappingPaper{" +
                "wrappedPack=" + wrappedPack +
                '}';
    }
}
