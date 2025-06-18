# 🎮 CS230 – DrawItOrLoseIt

This is a final project for CS 230: Operating Platforms at SNHU. It includes a Java-based game service that uses the **Singleton** and **Iterator** design patterns, along with a complete software design document covering system architecture recommendations for expanding the game across distributed environments.

---

## 📘 Project Summary

**DrawItOrLoseIt** is a team-based guessing game where players try to identify a phrase or object as it's gradually revealed through stock images. This project simulates the backend logic with the following features:

- Game, player, and team object management  
- Support for multiple simultaneous game instances  
- Architectural recommendations for platform expansion

---

## 🔧 Technologies

- Java  
- Eclipse IDE  
- Dropwizard (for REST simulation)  
- GitHub for version control  

---

## 🧩 Patterns Implemented

- **Singleton** – GameService class ensures a single instance across the app  
- **Iterator** – Enables clean traversal over a list of games

---

## 📂 Files Included

- `Entity.java` – Abstract base class  
- `Game.java` – Game instance logic  
- `GameService.java` – Singleton pattern implementation  
- `Player.java` and `Team.java` – User and team logic  
- `ProgramDriver.java` – Main app runner  
- `SingletonTester.java` – Unit test to verify singleton  
- `DrawItOrLoseIt_CS230.docx` – Full software design doc (Projects 1–3)

---

## 🛡️ Security & Scalability

The software design document includes detailed recommendations for:
- Choosing an operating system for deployment (Linux)
- Managing memory and file storage
- Handling cross-platform distributed communication
- Protecting user data and enforcing RBAC (role-based access control)

---

## 👩‍💻 Author

**Kylie Reiter**  
Southern New Hampshire University  
GitHub: [kylereiter](https://github.com/kylereiter93)
