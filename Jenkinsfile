pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sleep 1
      }
    }
    stage('error') {
      steps {
        parallel(
          "ui_testing": {
            sleep 1
            
          },
          "api_testing": {
            sleep 1
            
          }
        )
      }
    }
    stage('deploy') {
      steps {
        sleep 1
      }
    }
  }
}