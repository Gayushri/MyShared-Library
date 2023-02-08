def push() {
script {    
       pom = readMavenPom file: 'pom.xml'

         nexusArtifactUploader artifacts: [
         [artifactId: 'maven-project', 
         classifier: '', 
         file: '/webapp/target/webapp.war', 
         type: 'war']
          ],
          credentialsId: 'nexus', 
          groupId: 'com.example.maven-project', 
          nexusUrl: '13.233.224.133:8081', 
          nexusVersion: 'nexus3', 
          protocol: 'http', 
          repository: 'java_job', 
          version: "${pom.version}"
        }
}
