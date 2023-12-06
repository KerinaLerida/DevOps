pipeline {
    agent any
    stages {
        stage('Script') {
            steps {
                sh 'echo "Hello !"'
            }
        }
    }
}
