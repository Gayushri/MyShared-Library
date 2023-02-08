def war () {
  sshagent(['deploy']) {
   sh "scp -o StrictHostKeyChecking=no webapp/target/webapp.war ubuntu@13.233.59.113:/opt/tomcat/apache-tomcat-9.0.71/webapps"
   }
}  
