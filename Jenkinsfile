pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                        credentialsId: 'github_access_token',
                        url: 'https://github.com/ggam-nyang/Numble_Deploy.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
                echo "This is the first step in the Build Stage"
            }
        }
//        stage('Deploy') {
//            steps {
//                sh 'java -jar build/libs/server-0.0.1-SNAPSHOT-plain.jar'
//                echo "This is the first step in the Deploy Stage"
//            }
//        }
    }
}
