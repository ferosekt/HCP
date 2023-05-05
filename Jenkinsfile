pipeline {
    agent any

    stages {
        stage('Bulid') {
            steps {
                echo 'Bulid App'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
    }
    post {
        failure{
            emailext body: 'Build failure', subject: 'Pipeline Status', to: 'ferosekt64@gmail.com'
        }
    }

}
