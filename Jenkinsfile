pipeline {
    agent any
    stages{
        stage('Build') {
            steps{
                bat("D:\maven\apache-maven-3.6.3bin\mvn" clean test)
            }
        }
        stage('Package') {
            steps{
                bat("D:\maven\apache-maven-3.6.3bin\mvn" package/)
            }
        }
        stage('Results') {
            steps{
                junit '**/target/surefire-reports/TEST-*.xml'
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}
