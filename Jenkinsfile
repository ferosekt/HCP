pipeline {
    agent any stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ferosekt/HCP'
            }
        } stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        } stage('Run') {
            steps {
                bat 'java -jar target/aws-springboot.jar'
            }
        }
    }
}