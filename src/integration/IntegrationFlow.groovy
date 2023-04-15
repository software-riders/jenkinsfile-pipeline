package integration

import integration.utils.Commands

class IntegrationFlow {

    def myCommands

    IntegrationFlow(jenkinsFileContext) {
        myCommands = new Commands(jenkinsFileContext)
    }

    def build() {
        myCommands.call("echo Building application")
        sh 'echo Building application...'
        // myCommands.call("cd spring-boot-projeto")
        // myCommands.call("./gradlew build")
    }

//    def runTests() {
//        sh 'echo Running tests...'
//        // myCommands.call("cd spring-boot-projeto")
//        // myCommands.call("./gradlew test")
//    }
//
//    def deploy() {
//        sh 'echo Deploying application...'
//        // myCommands.call("cd spring-boot-projeto")
//
//        //  def jarFileName = myCommands.call("ls build/libs/*.jar | tail -1 | xargs -n 1 basename").trim()
//        // myCommands.call("java -jar spring-boot-projeto/build/libs/${jarFileName}")
//    }
}
