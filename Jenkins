pipeline {
    agent any

    stages {
        stage('vijay'){
            steps{
                git branch:'main',
                url:'https://github.com/tholuchurivijaykumar/demo.git'
            }
        }
        stage('Hello') {
            steps {
               sh 'javac Demo.java'
               sh 'java Demo.java'
            }
        }
    }
}
