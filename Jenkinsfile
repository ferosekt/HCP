pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        } stage('Run') {
            steps {
            withEnv ( ['JENKINS_NODE_COOKIE=do_not_kill'] )
            {
              bat 'start java -jar target/*.jar&'
            }
            }
        }
    }
}