pipeline {
	agent any
	
	tools { 
        maven 'Maven 3.3.9' 
        
      
    }
	
	stages {
		
		stage ('Compile Stage') {
			steps {
					bat 'mvn -Dmaven.test.failure.ignore=true clean install' 
			}
		}
		
		stage ('Testing Stage') {
			steps {
					bat'mvn test'
			}
		}
		
		/*stage ('sonarqube7.1') {
			steps {
					withSonarQubeEnv('sonarqube7.1'){
						bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'
				    }
			}
		}*/
		
		stage('Push the Docker Image'){
    	   steps{
 
    		    bat 'mvn docker:build'
    		}           
       }
		
		stage('Build Docker image'){
		   steps{
        		bat 'mvn docker:push'
    		}
    	}
    	
    	stage('Start the Docker Image'){
    	   steps{
 
    		    bat 'mvn docker:start'
    		}           
       }
       
       stage('Stop the Docker Image'){
    	   steps{
 
    		    bat 'mvn docker:stop'
    		}           
       }
       
      
		
	}
}