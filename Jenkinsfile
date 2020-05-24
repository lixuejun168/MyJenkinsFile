pipeline {
    agent any

    stages {
        stage('begin'){
            steps {
                echo 'hello pipeline begin'
            }
        }
        
    } 
}

git@github.com:lixuejun168/MyJenkinsFile.git

git([url: 'git@github.com:lixuejun168/iTest.git', branch: 'master'])

sh "mvn clean package spring--boot:repackage"