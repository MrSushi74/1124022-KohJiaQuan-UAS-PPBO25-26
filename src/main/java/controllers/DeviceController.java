package controllers;

import exceptions.EmptyListException;
import models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DeviceController implements IDeviceController, Comparator{
    List<Device> deviceList;

    public DeviceController (){
        this.deviceList = new ArrayList<>();
    }


    public void printALl() throws EmptyListException{
            int count = 0;
            for(Device d : deviceList){
                count++;
                System.out.println(count+". "+d.getOs());
            }
    }

    public void show(){
        try{
            int count = 0;
            for(Device d : deviceList){
                count++;
                System.out.println(count+". "+d.getOs());
            }
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

    }

    public void sort() {
        for (Device d : deviceList){

        }
    }

    public void add(String ownerName, String name, String version){
        deviceList.add(new Device(ownerName, new Windows( name, version)));
    }

    public void add(String ownerName, Ubuntu ubuntu){
        deviceList.add(new Device(ownerName, ubuntu));
    }

    public void add(String ownerName, Fedora fedora){
        deviceList.add(new Device(ownerName,fedora));
    }

    public void add(String ownerName, Linux linux){
        deviceList.add(new Device(ownerName,linux));
    }


    @Override
    public int compare(Object o1, Object o2) {
        Device a = (Device) o1;
        Device b = (Device) o2;

        if (a.getName().compareTo(b.getName()) < 0) return -1;
        if (b.getName().compareTo(a.getName()) > 0) return 1;
        return 0;
    }
}
