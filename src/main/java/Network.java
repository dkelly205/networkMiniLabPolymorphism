import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int deviceLimit;

    public Network(String name, int deviceLimit){
        this.name = name;
        this.devices = new ArrayList<>();
        this.deviceLimit = deviceLimit;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

//    public void connect(Desktop desktop){
////        devicesDesktop.add(desktop);
////    }
////
////
////    public void connect(Printer printer){
////        devicesPrinter.add(printer);
////    }
    //above 2 methods are what you call method overloading, where a method has the same name but take in different arguments

    public void connect(IConnect device){
        if(availableConnections() > 0) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int getDeviceLimit() {
        return deviceLimit;
    }

    public int availableConnections() {
        return getDeviceLimit() - deviceCount();
    }
}