pipeline {
    agent any
    stages{
        stage('Build') {
            steps{
                mvnHome = tool 'MAVEN_DEFAULT'
                withEnv(["MVN_HOME=$mvnHome"]) {
                    bat(/"%MVN_HOME%\bin\mvn" clean test/)
                }
            }
        }
        stage('Package') {
            steps{
                mvnHome = tool 'MAVEN_DEFAULT'
                withEnv(["MVN_HOME=$mvnHome"]) {
                    bat(/"%MVN_HOME%\bin\mvn" package/)
                }
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
