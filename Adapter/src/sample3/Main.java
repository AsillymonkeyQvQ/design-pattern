package sample3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.properties");
            f.setValue("year", "2021");
            f.setValue("month", "2");
            f.setValue("day", "13");
            f.writeToFile("file.properties");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
