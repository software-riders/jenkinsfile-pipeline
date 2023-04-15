package integration.utils

class Commands implements Serializable {
    def jenkinsFileContext

    Commands(jenkinsFileContext) {
        this.jenkinsFileContext = jenkinsFileContext
    }

    def call(String command) {
        jenkinsFileContext.sh(
                returnStdout: false,
                script: command
        )
    }

}