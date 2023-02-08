def deploy() {
  sshagent(['deploy-user']) {
  sh "scp -o StrictHostKeyChecking=no webapp/target/webapp.war ubuntu@13.233.59.113:/opt/tomcat/webapps"
 }
}  
