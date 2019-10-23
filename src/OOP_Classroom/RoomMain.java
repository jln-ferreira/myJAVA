package OOP_Classroom;

import java.util.ArrayList;
import java.util.List;

public class RoomMain {
    public static void main(String[] args) {

        Classroom ITDROOM = new Classroom();
        ITDROOM.getWindows().add(new Window(1,2,true));
        ITDROOM.getWindows().get(0).Clean();

    }
}
