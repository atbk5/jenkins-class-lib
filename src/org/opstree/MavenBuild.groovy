package org.opstree

class MavenBuild implements Serializable {
    def script

    MavenBuild(script) {
        this.script = script
    }
    def runSampleMethod() {
        script.echo "--- [src/org/opstree/MavenBuild.groovy] ---"
    
        script.stage('Maven Compile') {
            script.echo "Running Maven complile"
            script.sh "mvn compile"
        }
        script.stage('Maven Test') {
            script.echo "Running Maven test"
            script.sh "mvn test"
        }
        script.stage('Maven package') {
           script.echo "Running Maven package"
           script.sh "mvn package"
        }
        scripts.echo " --- done maven build in src ----"
    }
}
