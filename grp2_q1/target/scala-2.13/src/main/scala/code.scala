class code {
  def pass_Valid(password: String): Boolean = {
    if ((password.length >= 8) && (password.length <= 15))
      return true
    if (password.contains(" "))
      return false
    if (true) {
      var count = 0
      for (i <- 0 to 9) {
        val str1 = Integer.toString(i)
        if (password.contains(str1)) count = 1
      }
      if (count == 0) return false
    }
    if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".") || password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?") || password.contains("|"))) return false
    if (true) {
      var count = 0
      for (i <- 65 to 90) {
        val c = i.toChar
        val str1 = Character.toString(c)
        if (password.contains(str1)) count = 1
      }
      if (count == 0) return false
    }
    if (true) {
      var count = 0
      for (i <- 90 to 122) {
        val c = i.toChar
        val str1 = Character.toString(c)
        if (password.contains(str1)) count = 1
      }
      if (count == 0) return false
    }
    true
  }}
