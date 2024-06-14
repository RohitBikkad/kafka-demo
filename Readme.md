Step 1: Start Zookeeper
  Open Kafka Folder present in Local Disk C  
  Open cmd and put the command  - .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Step 2 : Start Apache Kafka Server
  Open Kafka Folder present in Local Disk C  
  Open cmd and put the command -   .\bin\windows\kafka-server-start.bat .\config\server.properties

Step 3 : start the Spring Boot Project

Step 4 : Start Consumer
  open C:\kafka\bin\windows> this path and open cmd and put command 
  Command - kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test1 --from-beginning
