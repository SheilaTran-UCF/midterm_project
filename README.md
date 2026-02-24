
# 🚀 Midterm Project – Dev Pipeline Demo

## 
Name: Minh Ngoc Tran  
Course: CEN 4802C – Software Integration, Configuration, and Testing  

---

## 📌 Project Overview
This project demonstrates a simple **software development pipeline** using multiple tools:

- IntelliJ IDEA (Development)
- Maven (Build & Dependency Management)
- JUnit (Testing)
- GitHub (Version Control)
- Docker (Containerization)

The goal is to show how these tools work together in a real-world workflow from development to deployment.

---

## ⚙️ Technologies Used
- Java 17
- Maven
- JUnit 5
- Docker
- GitHub

---

## 🧠 Key Concepts Demonstrated
- Writing and testing Java code
- Automating builds using Maven
- Running unit tests with JUnit
- Using GitHub for version control
- Containerizing an application using Docker
- Understanding basic CI/CD workflow concepts

---

## 📂 Project Structure

midterm_project/
├── src/
│ ├── main/java/.../App.java
│ ├── test/java/.../AppTest.java
├── target/
├── Dockerfile
├── pom.xml


---

## ▶️ How to Run the Project

### 1. Build the project using Maven
```bash
mvn clean package
2. Build Docker image
docker build -t midterm_project:latest .
3. Run Docker container
docker run --rm midterm_project:latest
✅ Expected Output
Midterm Pipeline Demo Running Successfully ✅
🧪 Testing

Run unit tests using:

mvn test
⚠️ Challenges Faced

One issue I encountered was with the Dockerfile naming.
A small naming mistake caused Docker to fail. After correcting it, I learned how important attention to detail is in development and debugging.

🚀 Future Improvements

Integrate Jenkins for full CI/CD automation

Add GitHub Actions as an alternative pipeline

Expand application functionality beyond simple demo

📌 Conclusion

This project helped me understand how modern development tools work together in a pipeline, from coding and testing to deployment using Docker.


