def quality_gate() {
  timeout(time: 5, unit: 'MINUTES') {
  echo "Initializing quality gates.."
  def result = waitForQualityGate()
  if (result.status != 'OK') {
    error "Pipeline aborted: ${result.status}"
  }
  else {
    echo "Quality passed: ${result.status}"
  }
 }         
}
