pipeline {
    agent any

    tools {
        maven 'mvn-3.3.3'
    }

    stages {
        
        stage('Build'){
            withCredentials(bindings: [sshUserPrivateKey(credentialsId: '169', \
                           keyFileVariable: 'SSH_KEY_FOR_iTest')]) {
                }
            steps {
                git([url: 'git@github.com:lixuejun168/iTest.git', branch: 'master'])
                sh 'printenv'
                sh "pwd"
                sh "mvn clean install test"
            }

            post {
                always {
                    junit testResults: "**/target/surefire-reports/*.xml"
                }
            }
        }
        
    }

    
}