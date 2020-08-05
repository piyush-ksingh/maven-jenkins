pipeline {

    stage('Build') {
            bat "mvn clean test" 
    }
    stage('Package') {
            bat "mvn package"
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
}
