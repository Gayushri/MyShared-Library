def push() {
script {    
       pom = readMavenPom file: 'pom.xml'

         nexusArtifactUploader artifacts: [
         [artifactId: 'maven-project', 
         classifier: '', 
         file: '/var/lib/jenkins/workspace/last-shared-job/webapp/target/webapp.war', 
         type: 'war']
          ],
          credentialsId: 'nexus', 
          groupId: 'com.example.maven-project', 
          nexusUrl: '13.233.244.8:8081', 
          nexusVersion: 'nexus3', 
          protocol: 'http', 
          repository: 'java_job', 
          version: "${pom.version}"
        }
}
