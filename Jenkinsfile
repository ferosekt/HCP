pipeline {
    agent any stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/ferosekt/HCP'
            }
        } stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        } stage('Run') {
            steps {
              bat 'start java -jar target/*.jar&'
            }
        }
    }
}