package models;

public class Ubuntu extends Linux{

    public Ubuntu(String name, String version) {
        super(name, version, "Gnome");
    }

    public Ubuntu(String name, String version, String desktopEnvironmentName) {
        super(name, version, desktopEnvironmentName);
    }
}
