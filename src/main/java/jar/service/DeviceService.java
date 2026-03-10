package jar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jar.model.Device;
import jar.model.Priority;
@Service
public class DeviceService {
    private  List<Device> devices=new ArrayList<>();
    private double maxLoad=5000.0;
    public Device addDevice(String id, String name ,String deviceType, double power,Priority priority){
    if(power <= 0){
    throw new IllegalArgumentException("Power must be greater than 0");
}
    Device d = new Device(id,name,deviceType,power,false, priority );
    devices.add(d);
    return d;
}

public String removeDevice(String id){
    for(Device device : devices){
        if(device.getId().equals(id)){
            devices.remove(device);
            return "Device removed successfully";
        }
    }
    return "Device not found";
}
public List<Device> getAllDevices(){
    return devices;
}
public Device toggleDevice(String id){
    for(Device device : devices){
        if(device.getId().equals(id)){
            device.setOn(!device.isOn());
            if(device.isOn()){
                autoShutoff();
            }
            return device;
        }
    }
    return null;
}
public double getCurrentLoad(){
    double total=0.0;
    for(Device device:devices){
        if(device.isOn())
            total+=device.getPower();
    }
    return total;
}
public List<Device> autoShutoff(){
    List<Device> turnedOff = new ArrayList<>();
    devices.sort((a, b) -> a.getPriority().ordinal() - b.getPriority().ordinal());
    for(Device device : devices){
        if(getCurrentLoad() >= maxLoad && device.isOn() && device.getPriority() != Priority.CRITICAL){
            device.setOn(false);
            turnedOff.add(device);
        }
    }
    return turnedOff;
}
}

