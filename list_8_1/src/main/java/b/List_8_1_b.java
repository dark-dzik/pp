package b;

import b.paper.WrappingPaper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class List_8_1_b {
    public static void main(String[] args) {
        ElfPacker elfPacker1 = new ElfPacker(50.0,150.0);

        Present cuboidPresent = new Present("PlayBox", PackType.CUBOID, new double[]{5.0, 5.0, 1.0});
        WrappingPaper cuboidWrappedPresent = elfPacker1.wrapPresent(cuboidPresent);

        log.info("Cuboid present: {}", cuboidPresent);
        log.info("Paper: {}", cuboidWrappedPresent);

        System.out.println("\n");

        Present cylindricalPresent = new Present("Klejnot Nilu", PackType.CYLINDRICAL, new double[]{5.0, 8.0});
        WrappingPaper cylindricalWrappedPaper = elfPacker1.wrapPresent(cylindricalPresent);

        log.info("Cylindrical present: {}", cylindricalPresent);
        log.info("Paper: {}", cylindricalWrappedPaper);
    }
}
