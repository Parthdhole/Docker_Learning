
Write Dockerfile – Describe how your app should run.

Build Image – Docker converts Dockerfile → Image.

Run Container – Container is created from the image.

Use container – Application runs inside the container.

Manage containers – Start/stop/remove containers.

Push image to Docker Hub (optional).





for Dockerizing the spring boot application with MySQL
1)by using working

step-1:-> pull the MySQL to docker 
            command :- docker pull MySQL:5.7
it pulls the MySQL Docker image from Docker Hub


step 2:- Create a Docker Network
        command:- docker network create springboot-mysql-net
        command :-docker network ls ->for checking 
This allows your Spring Boot container and MySQL container to communicate.
is create bridge between MySQL and Spring Boot application


strp-3:-Run MySQL Container in the Network


commands:-

docker run -d --name mysqldb --network springboot-mysql-net -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=hospital -e MYSQL_USER=parth -e MYSQL_PASSWORD=ROOT mysql:5.7

** checking the network 
command:->docker ps

** to run the conatainer to interactive mode 
 command -> docker exec -it c2e bash

** then we are inside the container then we give username and pass
command:-mysql -uparth -pROOT

step 4:- update the application properties file
#here we take a docker properties
spring.datasource.url=jdbc:mysql://mysqldb:3306/testdb
spring.datasource.username=parth
spring.datasource.password=ROOT

*****made the hospital api using to bild this wee need jar

step-5:spring boot docker image we need to create
  so we need Dockerfile and then
command:-docker build -t springboot-mysql-net . 


step 6:- create a spring boot container on same network
docker run --network springboot-mysql-net --name spring-container -p 8080:8080 -d springbootmysql
