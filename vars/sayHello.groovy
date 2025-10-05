def call(String Name) {
  echo "Running this in vars by ${Name}"
  echo "Current build number is: ${this.env.BUILD_NUMBER}"
}
