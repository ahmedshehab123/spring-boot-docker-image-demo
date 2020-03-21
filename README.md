# spring-boot-docker-image-demo

# Maven 
build project -->

mvn clean install

# Docker database image 

build  command  -- >  

sudo docker build -t flairs-db

run command --> 

sudo docker run -p 5433:5432 --name flairs-db flairs-db



# Docker spring image
build  command  -- > 
sudo docker build -t flairs-api

run command -->  please note that you have to link two images by (--link)  and change host in proerties file

sudo docker run  --link flairs-db  -p 8080:8080 flairs-apis

