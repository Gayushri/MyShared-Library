def war () {
  sshagent(['deploy']) {
   sh "scp -o StrictHostKeyChecking=no webapp/target/webapp.war ubuntu@15.206.149.155:/opt/tomcat/apache-tomcat-9.0.71/webapps"
   }
}  
