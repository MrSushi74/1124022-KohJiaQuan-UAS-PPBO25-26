package models;

public class Fedora extends Linux{

    public Fedora(String name, String version) {
        super(name, version, "KDE Plasma");
    }


    public Fedora(String name, String version, String desktopEnvironmentName) {
        super(name, version, desktopEnvironmentName);
    }


    @Override
    public String getBootInfo() {
        return toString();
    }
}
