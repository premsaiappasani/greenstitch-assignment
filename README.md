# SETUP greenstitch-assignment application

brew install git
brew install openjdk

// install java
https://www.java.com/en/download/help/download_options.html
// install maven
https://maven.apache.org/install.html

git clone git@github.com:premsaiappasani/greenstitch-assignment.git
cd greenstitch-assignment
code .
// opens vs code (or open this folder in your fav editor)

mvn clean install

Run the application in ide 
Or use this command
./mvnw spring-boot:run
