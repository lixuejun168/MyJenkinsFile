pipeline {
    agent any

    tools {
        maven 'mvn-3.3.3'
    }

    stages {
        stage('Build'){
            steps {
                git([url: 'https://lixuejun168:MAOjian166268@github.com/lixuejun168/iTest.git', branch: 'master'])
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