public class Printer implements IConnect {

    public Printer() {
    }

    public String print(String data) {
        return "printing: " + data;
    }


    @Override
    public String connect(String data) {
        return "connecting to network: " + data;
    }
}
