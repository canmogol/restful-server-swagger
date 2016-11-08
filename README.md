# REST - Swagger
RESTful web service and Swagger API example

to compile the project, type below command in project folder
```
mvn clean install
```

you may download wildfly to test
```
http://wildfly.org/
```

start the server with below command in wildfly folder
```
./bin/standalone.sh
```

to deploy to wildfly type below command
```
mvn wildfly:deploy
```

visit the URL below, you will find the WADL and Swagger links
```
http://localhost:8080/restful-server-ss/
```

