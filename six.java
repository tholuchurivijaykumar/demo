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
