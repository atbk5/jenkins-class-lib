package org.opstree

class Utils implements Serializable {
    def script

    Utils(script) {
        this.script = script
    }
    def runSampleMethod(String name) {
        script.echo "--- [src/org.opstree/Utils.groovy] ---"
        script.echo "Utils running structured task for: ${name}"

        script.stage('Class-Based Logic') {
            script.echo "This stage was triggered from the shared library class."
        }
    }
} 
  
