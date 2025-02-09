pipeline {
    agent any
     tools {
        maven 'mvn'  // Adjust according to your Maven installation
        jdk 'JDK'  // Adjust according to your Java version
        allure 'Allure'
    }

    stages {
        stage('check Git version') {
                steps {
                    bat 'git --version'
                }
        }
        stage('Clone Repository') {
            steps {
                git branch: 'main' , url:'https://github.com/rbarikot/ProwessRestAssured.git'
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    // Run your tests using Maven
                    bat "mvn clean test"
                }
            }
        }

        stage('Publish Allure Report') {
            steps {
                allure includeProperties: false, reportBuildPolicy: 'ALWAYS', results: [[path: 'allure-results']]
            }
        }

    }

    post {

        success {
            echo "Tests completed successfully!"
        }
        failure {
            echo "Tests failed. Check the logs for errors."
        }
    }
}
