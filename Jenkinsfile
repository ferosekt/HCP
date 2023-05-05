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
                withEnv (['JENKINS_NODE_COOKIE=do_not_kill']) {
                    bat 'start java -jar target/demo-0.0.1-SNAPSHOT.jar&'
                }
            }
        }
    }
}