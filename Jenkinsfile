node {

    withMaven(maven:'maven') {

        stage('Checkout') {
            git url: 'https://github.com/SabaTalal/CICD-Tutorial.git', branch: 'master'
        }

        stage('Build') {
            sh 'mvn clean install'
        }

        stage('Image') {
            dir ('cicd-service') {
                def app = docker.build "localhost:5000/cicd-service"
                app.push()
            }
        }

        stage ('Run') {
            docker.image("localhost:5000/cicd-service").run('-p 9080:9080 -h discovery --name cicd')
        }
   

    }

} 