public class InternetRadio implements IConnect {


    @Override
    public String connect(String data) {
        return "connecting to " + data;
    }


    public String tune(String station) {
        return station;
    }
}
