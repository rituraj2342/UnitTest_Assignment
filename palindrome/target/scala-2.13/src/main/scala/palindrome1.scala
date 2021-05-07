class palindrome1 {
  def pal(num :Int): Int ={

    var r = 0
    var sum = 0
    var temp = 0
    var n = num

    temp = n
    while ( {
      n > 0
    }) {
      r = n % 10

      sum = (sum * 10) + r
      n = n / 10
    }
    sum
  }}
