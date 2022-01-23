package b;

import java.util.List;
import java.util.concurrent.Semaphore;

public class List_11_b {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Kettle kettle = new Kettle(200, 200);

        Dweller stefan = new Dweller("Stefan", kettle, new Cup(100, 100), 3, semaphore);
        Dweller roman = new Dweller("Roman", kettle, new Cup(100, 100), 3, semaphore);
        Dweller borys = new Dweller("Borys", kettle, new Cup(100, 100), 3, semaphore);

        List.of(stefan, roman, borys).forEach(Dweller::start);
    }
}
