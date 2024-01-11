import domain.usecase.Romanizer
import kotlin.math.floor

fun main(args: Array<String>) {
    val romanizer = Romanizer()

    print(romanizer.romanize(299))

}