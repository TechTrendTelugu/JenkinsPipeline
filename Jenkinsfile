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
		
		
	}
}