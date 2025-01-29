pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository and use the main branch
                git branch: 'main', url: 'https://github.com/kamruddin-mansoori/test-app.git'
            }
        }
        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run the tests using Maven
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Archive the test results
            junit 'target/surefire-reports/*.xml'
        }
        success {
            // Notify success
            echo 'Build and tests succeeded!'
        }
        failure {
            // Notify failure
            echo 'Build or tests failed.'
        }
    }
}