pipeline {
	agent any
	
	tools { 
        maven 'Maven 3.3.9' 
      
    }
	
	stages {
		stage ('Compile Stage') {
			steps {
					sh 'mvn -Dmaven.test.failure.ignore=true clean install' 
			}
		}
		stage ('Testing Stage') {
				steps {
					withMaven(maven : 'apache-maven-3.6.1') {
					bat'mvn test'
					}
				}
		}
		stage ('Install Stage') {
			steps {
				withMaven(maven : 'default') {
				bat'mvn install'
				}
			}
		}
	}
}