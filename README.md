# Card Game

Java Version: "25.0.4.1"  
JUnit Version: "5.10.3"


Instructions to run:  
`javac CardGame.java Player.java`  
`java CardGame`

Instructions to run test suit:  
  **Requirements**
    JDK 11 or newer and JUnit 5 (Jupiter 5.10.3).
    
**Steps**

source cited: [Clickable Text] https://docs.junit.org/5.10.3/user-guide/index.html#running-tests-console-launcher
0. Open terminal and navigate to src

1. Download JUnit once
   `curl -fL -o junit-platform-console-standalone-1.10.3.jar https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.3/junit-platform-console-standalone-1.10.3.jar`
3. Open a terminal in that folder and compile the code:
`javac -cp ".:junit-platform-console-standalone-1.10.3.jar" CardGame.java Player.java CardGameTest.java PlayerTest.java`

4. Run both test classes:
`java -jar junit-platform-console-standalone-1.10.3.jar execute --class-path . --select-class CardGameTest --select-class PlayerTest`


