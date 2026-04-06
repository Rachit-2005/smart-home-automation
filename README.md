# 🏠 Smart Home Automation System

A full-stack Smart Home Automation System built with Java and Spring Boot backend and a responsive HTML/CSS/JavaScript frontend. The system allows users to manage home appliances, monitor real-time power load, and automatically shut off devices based on priority when the load exceeds the sanctioned limit.

---

## 🚀 Live Demo
🔗 [Smart Home Automation System](https://smart-home-automation-production-bdbe.up.railway.app)

---

## ✨ Features

- 🔐 **Login Authentication** — Secure login page with a modern glassmorphism UI
- ➕ **Device Management** — Add, remove, and toggle home appliances
- ⚡ **Real-time Load Monitoring** — Tracks total power consumption of all active devices
- 🔴 **Auto Shutoff** — Automatically turns off devices by priority when load exceeds 5000W
- 🏷️ **4-Tier Priority System** — Comfort → Non-Essential → Necessary → Critical
- ✅ **Input Validation** — Prevents invalid device data from being added
- 📱 **Responsive UI** — Works on both desktop and mobile

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java |
| Framework | Spring Boot |
| Architecture | MVC (Model-View-Controller) |
| API | REST API |
| Frontend | HTML, CSS, JavaScript |
| Deployment | Railway |
| Version Control | Git & GitHub |

---

## 📁 Project Structure
```
src/main/java/jar/
├── model/
│   ├── Device.java
│   └── Priority.java
├── service/
│   └── DeviceService.java
├── controller/
│   ├── DeviceController.java
│   └── LoginController.java
├── dto/
│   └── DeviceRequest.java
└── SmartHomeApplication.java

src/main/resources/
├── static/
│   ├── index.html       ← Login page
│   └── dashboard.html   ← Main dashboard
└── application.properties
```

---

## ⚙️ How to Run Locally

**Prerequisites:**
- Java 17+
- Maven

**Steps:**
```bash
# 1. Clone the repository
git clone https://github.com/Rachit-2005/smart-home-automation.git

# 2. Navigate to project folder
cd smart-home-automation

# 3. Run the application
./mvnw spring-boot:run

# 4. Open in browser
http://localhost:8080
```

---

## 🔑 Login Credentials
```
Username: admin
Password: smarthome123
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /devices | Get all devices |
| POST | /devices | Add a new device |
| PUT | /devices/{id} | Toggle device on/off |
| DELETE | /devices/{id} | Remove a device |
| GET | /devices/load | Get current load |
| POST | /devices/autoshutoff | Trigger auto shutoff |
| POST | /login | Authenticate user |

---

## 🔮 Future Scope

- **ESP32/ESP8266** hardware integration for real physical appliance control
- **Current sensors (ACS712)** for live wattage readings
- **MQTT protocol** for lightweight IoT communication
- **MySQL/PostgreSQL** database for persistent device storage
- **JWT authentication** for secure session management
- **OAuth 2.0** for Google/GitHub social login
- **Email/SMS alerts** when load exceeds threshold
- **Mobile app** using React Native or Flutter

---

## 👨‍💻 Author

**Rachit Saxena**
- GitHub: [@Rachit-2005](https://github.com/Rachit-2005)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
