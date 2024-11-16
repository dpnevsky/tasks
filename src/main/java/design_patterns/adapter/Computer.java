package design_patterns.adapter;

public class Computer {

    public void readData(IUsb iUsb) {

        iUsb.connect();
        System.out.println("Reading data from memory card.");
    }
}
