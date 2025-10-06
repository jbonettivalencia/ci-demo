pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the Java app...'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests passed successfully!'
        }
        failure {
            echo 'Build failed. Check console output for details.'
        }
    }
}
