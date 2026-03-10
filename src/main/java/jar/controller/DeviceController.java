package jar.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.DeviceRequest;
import jar.model.Device;
import jar.service.DeviceService;

@CrossOrigin(origins = "*")
@RestController

@RequestMapping("/devices")
public class DeviceController {
    @Autowired
private DeviceService deviceService;
@GetMapping
public List<Device> getAllDevices(){
    return deviceService.getAllDevices();
}
@PostMapping
public Device addDevice(@RequestBody DeviceRequest request){
    String id = (request.getId() != null && !request.getId().isEmpty()) 
        ? request.getId() 
        : UUID.randomUUID().toString();
    
    return deviceService.addDevice(id, request.getName(), request.getDeviceType(), request.getPower(), request.getPriority());
}

@DeleteMapping("/{id}")
public String removeDevice(@PathVariable String id){
    return deviceService.removeDevice(id);
}

@PutMapping("/{id}")
public Device toggleDevice(@PathVariable String id){
    return deviceService.toggleDevice(id);
}

@GetMapping("/load")
public double getCurrentLoad(){
    return deviceService.getCurrentLoad();
}

@PostMapping("/autoshutoff")
public List<Device> autoShutoff(){
    return deviceService.autoShutoff();
}

@PostMapping("/login")
public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
    String username = credentials.get("username");
    String password = credentials.get("password");

    if (username.equals("admin") && password.equals("smarthome123")) {
        return ResponseEntity.ok("Login successful");
    } else {
        return ResponseEntity.status(401).body("Invalid username or password");
    }
}


}

