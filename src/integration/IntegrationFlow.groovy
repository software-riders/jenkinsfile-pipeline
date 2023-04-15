package integration

import integration.utils.Commands

class IntegrationFlow {

    def myCommands

    IntegrationFlow() {
        myCommands = new Commands()
    }

    def build() {
        echo 'Building application...'
        // myCommands.call("cd spring-boot-projeto")
        // myCommands.call("./gradlew build")
    }

    def runTests() {
        echo 'Running tests...'
        // myCommands.call("cd spring-boot-projeto")
        // myCommands.call("./gradlew test")
    }

    def deploy() {
        echo 'Deploying application...'
        // myCommands.call("cd spring-boot-projeto")

        //  def jarFileName = myCommands.call("ls build/libs/*.jar | tail -1 | xargs -n 1 basename").trim()
        // myCommands.call("java -jar spring-boot-projeto/build/libs/${jarFileName}")
    }
}
