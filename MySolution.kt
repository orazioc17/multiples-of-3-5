fun solution(number: Int): Int {
    var acum = 0
    for (i in 0 until number) { if (i % 3 == 0 || i % 5 == 0) acum += i }
    return acum
}
