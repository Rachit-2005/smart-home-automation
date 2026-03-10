package jar.model;

public class Device {
    private String id;
    private String name;
    private String deviceType;
    private double power;
    private boolean isOn;
    private Priority priority;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDeviceType() {
        return deviceType;
    }
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public Device(String id,String name,String deviceType,double power,boolean isOn,Priority priority){
        this.id=id;
        this.name=name;
        this.deviceType=deviceType;
        this.power=power;
        this.isOn=isOn;
        this.priority=priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

}
