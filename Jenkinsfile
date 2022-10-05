pipeline {
    agent {
          docker {
                image 'otus'
                args '-it --memory=12g --cpus="4"'
          }
    }
    stages {
        stage('init') {
            steps {
                  sh 'chmod +x gradlew'
                  sh './gradlew'
            }
        }
        stage('build') {
            steps {
                 sh './gradlew assembleDebug'
            }
        }
    }
    post {
        always {
            archiveArtifacts(artifacts: '**/build/reports/**', allowEmptyArchive: true)
        }
    }
}