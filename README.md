# spring-boot-docker-image-demo

# Docker info 

# database image 

build  command  -- >  

sudo docker build -t flairs-db

run command --> 

sudo docker run -p 5433:5432 --name flairs-db flairs-db



# spring image
build  command  -- > 
sudo docker build -t flairs-api

run command -->  please note that you have to link two images by (--link)  and change host in proerties file

sudo docker run  --link flairs-db  -p 8080:8080 flairs-apis

