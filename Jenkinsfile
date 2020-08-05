Pipeline {
	agent any
    stage('Preparation') {
	
        mvnHome = tool 'MavenDefault'
    }
    stage('Build') {
        withEnv(["MVN_HOME=$mvnHome"]) {
            bat(/"%MVN_HOME%\bin\mvn" clean test/)
        }
    }
    stage('Package') {
        withEnv(["MVN_HOME=$mvnHome"]) {
            bat(/"%MVN_HOME%\bin\mvn" package/)
        }
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
}d