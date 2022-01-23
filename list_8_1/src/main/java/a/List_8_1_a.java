package a;

import lombok.extern.slf4j.Slf4j;
import a.pack.CuboidPack;
import a.pack.CylindricalPack;
import a.pack.Pack;
import a.paper.WrappingPaper;

@Slf4j
public class List_8_1_a {

    public static void main(String[] args) {
        ElfPacker elfPacker1 = new ElfPacker(50.0, 150.0);

        Pack cuboidPresent = new CuboidPack("PlayBox", 5.0, 5.0, 1.0);
        WrappingPaper cuboidWrappedPresent = elfPacker1.wrapPresent(cuboidPresent);

        log.info("Cuboid present: {}", cuboidPresent);
        log.info("Paper: {}", cuboidWrappedPresent);

        System.out.println("\n");

        Pack cylindricalPack = new CylindricalPack("Klejnot Nilu", 5.0, 8.0);
        WrappingPaper cylindricalWrappedPresent = elfPacker1.wrapPresent(cylindricalPack);

        log.info("Cylindrical present: {}", cylindricalPack);
        log.info("Paper: {}", cylindricalWrappedPresent);

    }
}
