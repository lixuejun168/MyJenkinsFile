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