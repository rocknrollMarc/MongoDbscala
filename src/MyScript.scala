class MyScript(host: String) {
  require(host != null, "Have to provide host name")
  if(host == "127.0.0.1") println("host = local")
  else println("host = " + host)
}
