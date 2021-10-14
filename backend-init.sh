apt update
apt install default-jdk
apt install maven
echo "Did you change the IP?"
pause
mvn spring-boot:run -Dspring-boot.run.arguments=--spring.datasource.url=jdbc:mysql://127.0.0.1:3306/db_counter
