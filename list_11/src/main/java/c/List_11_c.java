package c;

import java.util.List;

public class List_11_c {

    public static void main(String[] args) {
        Kettle kettle = new Kettle(200, 200);

        Dweller stefan = new Dweller("Stefan", kettle, new Cup(100, 100), 3);
        Dweller roman = new Dweller("Roman", kettle, new Cup(100, 100), 3);
        Dweller borys = new Dweller("Borys", kettle, new Cup(100, 100), 3);

        List.of(stefan, roman, borys).forEach(Dweller::start);
    }
}
