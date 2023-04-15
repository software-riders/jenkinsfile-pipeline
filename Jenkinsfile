@Library('pipeline-library')
import integration.*

pipeline {

    agent any

    stages {

        stage('prepare') {

            steps {
                script {
                    flow = new IntegrationFlow()
                }
            }
        }

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