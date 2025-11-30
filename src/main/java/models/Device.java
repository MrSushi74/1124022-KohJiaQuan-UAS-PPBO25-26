package models;

public class Device {
    private String ownerName;
    private OperatingSystem os;

    public Device (String ownerName, OperatingSystem os){
        this.ownerName = ownerName;
        this.os = os;
    }

    public String getName(){
        return this.getName();
    }

    public String getOs(){
        return os.getBootInfo();
    }
}
