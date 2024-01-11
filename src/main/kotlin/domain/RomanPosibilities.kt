sealed class RomanPossibilities(val value: Int) {
    data object I : RomanPossibilities(value = 1)
    data object V : RomanPossibilities(value = 5)
    data object X : RomanPossibilities(value = 10)
    data object L : RomanPossibilities(value = 50)
    data object C : RomanPossibilities(value = 100)
    data object D : RomanPossibilities(value = 500)
    data object M : RomanPossibilities(value = 1000)

}