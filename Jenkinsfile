pipeline {
  agent any

  stages {
    stage('Check OUT') {
      steps {
        git branch: 'main', credentialsId: 'mirohee', url: 'https://github.com/mirohee/FarToCel.git'

      }
    }
stage('Build') {
      steps {
        bat 'mvn clean install'
      }

    }

  }
}
