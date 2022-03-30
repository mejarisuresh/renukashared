def call(ip,user,credid)
{
       sshagent(['aaaa']) {
         sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat8/webapps"
     sh "ssh ${user}@${ip} /opt/tomcat8/bin/startup.sh"
               
             }
}
