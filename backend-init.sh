sudo apt update
sudo apt install default-jdk
sudo apt install maven
sudo mvn spring-boot:run -Dspring-boot.run.arguments=--spring.datasource.url=jdbc:mysql://10.0.0.1:3306/db_counter
