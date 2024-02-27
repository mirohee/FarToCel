pipeline {
  agent any

  stages {
    stage('Check OUT') {
      steps {
        git branch: 'master', credentialsId: 'mirohee', url: 'https://github.com/mirohee/myInvestmentJenkins.git'

      }
    }
stage('Build') {
      steps {
        bat 'mvn clean install'
      }

    }

  }
}
