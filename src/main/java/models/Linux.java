package models;

import java.util.List;

public class Linux extends OperatingSystem{
    private String desktopEnvironmentName;

    public Linux (String name, String version, String desktopEnvironmentName){
        super(name,version);
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

    @Override
    public String getBootInfo() {
        return toString();
    }
}
