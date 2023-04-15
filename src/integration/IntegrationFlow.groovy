package integration

import integration.utils.Commands

class IntegrationFlow {

    def commands

    IntegrationFlow(jenkinsFileContext) {
        commands = new Commands(jenkinsFileContext)
    }

    def build() {
        commands.call("echo Building application")
        // myCommands.call("cd spring-boot-projeto")
        // myCommands.call("./gradlew build")
    }

   def runTests() {
       commands.call("echo Building application")
       // myCommands.call("cd spring-boot-projeto")
       // myCommands.call("./gradlew test")
   }

   def deploy() {
       commands.call("echo Building application")
       // myCommands.call("cd spring-boot-projeto")

       //  def jarFileName = myCommands.call("ls build/libs/*.jar | tail -1 | xargs -n 1 basename").trim()
       // myCommands.call("java -jar spring-boot-projeto/build/libs/${jarFileName}")
   }
}
