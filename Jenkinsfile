node {
    
        stage 'Checkout'
        checkout scm

        stage 'Application Build'
        def mvnHome = tool 'Maven'
        sh "${mvnHome}/bin/mvn clean package verify"

        stage 'Artifacts archive'
        step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])

        stage "Running code analysis scan"
        def common = load "/var/lib/jenkins/test.groovy"
        common.build()
    
}
