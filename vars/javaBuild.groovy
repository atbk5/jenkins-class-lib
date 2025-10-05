def call() {
  echo "Running this in vars"
  def mvnUtil = new org.opstree.MavenBuild(this)
  mvnUtil.runSampleMethod()
}
