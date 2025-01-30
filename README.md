# community-management-service
Microservice to manage community and groups

Below are the steps to build and deploy the service along with the envoy side-car proxy:

Build and compile:
- mvn clean package

Build, tag and push image for side-car:
- cd k8s/envoy
- docker build -t comm-mgmt-envoy-sidecar .
- docker tag comm-mgmt-envoy-sidecar localhost:5050/comm-mgmt-envoy-sidecar
- docker push localhost:5050/comm-mgmt-envoy-sidecar

To build a docker image of the service using the docker file of the project run the following command:
- cd ../..
- docker build -t community-mgmt-service .

Once the image is successfully built on the openjdk:17 base image, you can tag the image with the local registry (running on port 5050) to run it on a local kubernetes cluster with the following command:
- docker tag community-mgmt-service localhost:5050/community-mgmt-service

Before running docker tag and docker push commands, please ensure that the registry server is up and running on port 5050. Then use the docker push command to push the image to local registry
- docker push localhost:5050/community-mgmt-service

To deploy the service on Kubernetes cluster run the following command:
- kubectl apply -f k8s/deployment.yml

Once the service is deployed you can check if the service is healthy by calling the below end-point:
- http://localhost:31000/api/community/health
Note the above end-point invokes the main service via envoy sidecar