class Demo{
public static void main(String args[]){
System.out.println("hello vijay");
}
}



Kubernetes

  # Start Minikube
minikube start --driver=docker

# Check Minikube status
minikube status

# Check Kubernetes nodes
kubectl get nodes

# Check all resources
kubectl get all

# Create deployment
kubectl create deployment demo --image=<image-name>

# Expose deployment
kubectl expose deployment demo --type=NodePort --port=8080

# Apply YAML files
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml

# Check pods
kubectl get pods

# Check deployments
kubectl get deployments

# Check services
kubectl get services

# Get application URL
minikube service demo --url

# View pod logs
kubectl logs <pod-name>

# Scale deployment
kubectl scale deployment demo --replicas=3

# Delete deployment
kubectl delete deployment demo

# Delete service
kubectl delete service demo

# Stop Minikube
minikube stop

# Delete Minikube cluster
minikube delete










































































































































































































































































































































