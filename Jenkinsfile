@Library('pipeline-library')
import integration.*

pipeline {

    agent any

    environment {
        flow = new IntegrationFlow()
    }

    stages {

        stage("build") {

            steps {
                flow.build()
            }
        }

        stage("test") {

            steps {
                flow.runTests()
            }
        }

         stage("deploy") {

            steps {
                flow.deploy()
            }
        }
    }
}