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
                script {
                    flow.build()
                }
            }
        }

        stage("test") {

            steps {
                script {
                    flow.runTests()
                }
            }
        }

         stage("deploy") {

            steps {
                script {
                    flow.deploy()
                }
            }
        }
    }
}