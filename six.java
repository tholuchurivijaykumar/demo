public class six{

    public static void main(String[] args) {

        System.out.println("Hello World");
    }
}

installation commands
# Update system
sudo apt update

# Install Java (JDK 17)
sudo apt install -y openjdk-17-jdk

# Verify Java
java -version

# Add Jenkins GPG Key
curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key | sudo tee /usr/share/keyrings/jenkins-keyring.asc > /dev/null

# Add Jenkins Repository
echo "deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian-stable binary/" | sudo tee /etc/apt/sources.list.d/jenkins.list > /dev/null

# Update package list
sudo apt update

# Install Jenkins
sudo apt install -y jenkins

# Enable Jenkins
sudo systemctl enable jenkins

# Start Jenkins
sudo systemctl start jenkins

# Check Jenkins status
sudo systemctl status jenkins

# Get Jenkins initial admin password
sudo cat /var/lib/jenkins/secrets/initialAdminPassword

# Open Jenkins in browser
http://localhost:8080




## 1. Jenkins Permissions

Give Jenkins access to Docker and restart the service:

```bash
sudo usermod -aG docker jenkins
sudo systemctl restart jenkins
```

Check Jenkins status:

```bash
sudo systemctl status jenkins
```

---

## 2. Docker Permissions

Give your user access to Docker:

```bash
sudo usermod -aG docker $USER
newgrp docker
```

Verify:

```bash
docker ps
docker images
```

PERMISSIONS

## 3. Minikube / Kubernetes Permissions

Create the Kubernetes configuration directory for Jenkins:

```bash
sudo mkdir -p /var/lib/jenkins/.kube
```

Copy the Kubernetes configuration:

```bash
sudo cp ~/.kube/config /var/lib/jenkins/.kube/config
```

Copy the Minikube certificates:

```bash
sudo cp -r ~/.minikube /var/lib/jenkins/
```

Give ownership to Jenkins:

```bash
sudo chown -R jenkins:jenkins /var/lib/jenkins/.kube
sudo chown -R jenkins:jenkins /var/lib/jenkins/.minikube
```

Restart Jenkins:

```bash
sudo systemctl restart jenkins
```

Verify Kubernetes access:

```bash
sudo -u jenkins kubectl get nodes
```

---

## 4. Verify Everything

Docker:

```bash
sudo -u jenkins docker ps
```

Kubernetes:

```bash
sudo -u jenkins kubectl get nodes
```

Jenkins:

```bash
sudo systemctl status jenkins
```


