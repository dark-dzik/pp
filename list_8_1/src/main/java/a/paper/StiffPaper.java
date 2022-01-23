package a.paper;

import a.pack.Pack;

public class StiffPaper extends WrappingPaper {

    public StiffPaper(Pack presentToPack) {
        super(presentToPack);
    }

    @Override
    public String toString() {
        return "StiffPaper{} " + super.toString();
    }
}
