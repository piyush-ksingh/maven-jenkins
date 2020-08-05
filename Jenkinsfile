pipeline {
    agent any
    stages{
        stage('Maven-Install'){
            steps{
                step{
                    mvnHome = tools 'MavenDefault'
                }
            }
        }
        stage('Build') {
            steps{
                withEnv(["MVN_HOME=$mvnHome"]) {
                   bat(/"%MVN_HOME%\bin\mvn" clean test/)
                } 
            }
        }
        stage('Package') {
            steps{
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
