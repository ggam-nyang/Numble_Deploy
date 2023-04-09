pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'git@github.com:ggam-nyang/Numble-Deploy.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Deploy') {
            steps {
                sh 'java -jar build/libs/server-0.0.1-SNAPSHOT-plain.jar'
            }
        }
    }
}
