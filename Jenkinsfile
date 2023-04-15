@Library('pipeline-library')
import integration.*

pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                script {
                    def flow = new IntegrationFlow()
                    flow.build()
                }
            }
        }

        stage("test") {

            steps {
                script {
                    def flow = new IntegrationFlow()
                    flow.runTests()
                }
            }
        }

         stage("deploy") {

            steps {
                script {
                    def flow = new IntegrationFlow()
                    flow.deploy()
                }
            }
        }
    }
}