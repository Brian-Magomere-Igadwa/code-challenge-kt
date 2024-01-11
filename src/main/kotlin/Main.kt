import domain.usecase.Reverser
import domain.usecase.Romanizer
import kotlin.math.floor

fun main(args: Array<String>) {
    val romanizer = Romanizer()
    val reverser = Reverser()

//    print(romanizer.romanize(299))
    print(reverser.reverseWords("hello word."))

}