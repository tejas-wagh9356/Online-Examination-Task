Online Examination System 

🧑‍💻 Objective

The objective of this project is to build a console-based Online Examination System in Java that includes user authentication, profile updates,
MCQ-based test functionality, timer-based auto submission, and session logout.

This project demonstrates practical usage of:

Object-Oriented Programming

Multi-threading (Timer + Auto Submit)

HashMap (for user login data)

User input handling

Menu-driven programs in Java

Tool Used
Category	Tools
Programming Language	Java / VS Code

Project Explanation
This Online Examination System allows users to log in using a valid username and password.
After logging in, users can:

✔ Update Profile

Modify their username and password.

✔ Attempt MCQ Exam

The exam contains multiple-choice questions.
A timer runs in the background.
If the timer ends, the exam is auto-submitted.
If the user completes answers early, they can manually submit.

✔ Auto Submit System

A background thread counts down (e.g., 20 seconds).
If time ends → exam automatically ends and score is displayed.

✔ Logout

Ends the user session.

⭐ Features

🔐 User Login Authentication

📝 Update Profile & Password

❓ MCQ-based Examination

⏳ Live Timer

⚡ Auto Submit on Timeout

🚪 Logout & Close Session

📊 Final Score Display

📂 Folder Structure
Online_Examination_System/
│
├── Exam.java
├── Main.java
├── screenshots/
│     ├── 01_Project_Start.png
│     ├── 02_Login.png
│     ├── 03_Profile_Update.png
│     ├── 04_Exam_Start.png
│     ├── 05_Auto_Submit.png
│     ├── 06_Final_Score.png
│
└── README.md

▶️ How to Run the Project
Step 1: Open terminal
cd Online_Examination_System

Step 2: Compile both Java files
javac Main.java Exam.java

Step 3: Run the project
java Main

🖼 Screenshots (Add these in screenshots folder)

01_Project_Start.png

02_Login.png

03_Profile_Update.png

04_Exam_Start.png

05_Auto_Submit.png

06_Final_Score.png

Conclusion
This project successfully demonstrates the working of a complete Online Examination System, including login,
MCQs, timer, auto-submit, and logout functions.
