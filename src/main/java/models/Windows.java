package models;

public class Windows extends OperatingSystem{

    public Windows (String name, String version){
        super(name,version);
    }

    @Override
    public String getBootInfo(){
        return toString();
    }
}
