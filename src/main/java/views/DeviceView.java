package views;

import controllers.DeviceController;
import exceptions.EmptyListException;
import exceptions.InvalidMenuException;
import exceptions.InvalidOSException;
import models.Device;
import models.Fedora;
import models.Ubuntu;
import models.Windows;
import utils.CLIUtils;

public class DeviceView {
    private DeviceController deviceController;

    public DeviceView() {
        this.deviceController = new DeviceController();
    }

    public void render() throws InvalidMenuException {
        int menu = -1;
        do {
            int choice = 0;
            try {
                this.menuPrint();
                choice = CLIUtils.inputInt();
            } catch (InvalidMenuException e) {
                System.out.println(e.getMessage());
            }
            menuHandle(choice);
        } while(true);
    }

    public void menuHandle(int choice) {
        switch (choice){
            case 1:
                try{
                    handleMenu();
                } catch (InvalidOSException e){
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try{
                    deviceController.show();
                } catch (EmptyListException e){
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                try{
                    deviceController.sort();
                } catch (EmptyListException e){
                    System.out.println(e.getMessage());
                }

        }
    }

    public void handleMenu(){
        try{
            String ownerName = CLIUtils.input("Input Owner Name");
            int OS = CLIUtils.inputInt("Pilih OS : 1.Windows 2.Ubuntu 3.Fedora");
            String osName = handleAdd(OS);
            String version = CLIUtils.input("Input version");
            deviceController.add(ownerName, osName, version);
        } catch (InvalidOSException e){
            System.out.println(e.getMessage());
        }
       ;
    }
    public String handleAdd(int OS) {
//        if (OS == 1){
//            return new Device(ownerName, new Windows("Windows", version));
//        } else if (OS == 2){
//            return new Device(ownerName, new Ubuntu("Ubuntu", version));
//        } else if (OS == 3){
//            return new Device(ownerName, new Fedora("Fedora", version));
//        } return null;

        if (OS == 1){
            return "Windows";
        } else if (OS == 2){
            return "Ubuntu";
        } else if (OS == 3){
            return "Fedora";
        } else{
            return null;
        }
    }
    public void menuPrint(){
        System.out.println("Menu Utama:\n" +
                "1. Tambah Device\n" +
                "2. Tampilkan Semua Device \n" +
                "3. Tampilkan Semua Device Terurut Berdasarkan OS\n" +
                "0. Keluar");
    }
}
