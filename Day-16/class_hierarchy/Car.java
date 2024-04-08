package class_hierarchy;

import java.sql.SQLOutput;

public class Car extends Sound{
    @Override
    public void sounds() {
        System.out.println("Car Sounds");
    }
}
