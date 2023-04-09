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
        stage('Deploy') {
            steps {
                sh 'ansible-playbook /ansible/deploy_web_server_playbook.yml'
                echo "This is the first step in the Deploy Stage"
            }
        }
    }
}
