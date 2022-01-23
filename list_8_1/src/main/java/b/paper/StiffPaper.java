package b.paper;

import b.Present;

public class StiffPaper extends WrappingPaper {

    public StiffPaper(Present presentToPack) {
        this.wrappedPresent = presentToPack;
    }

    @Override
    public String toString() {
        return "StiffPaper{} " + super.toString();
    }
}
