import domain.usecase.Reverser
import domain.usecase.Romanizer
import domain.usecase.NeedleFinder
import domain.usecase.MedianFinder
import kotlin.math.floor

fun main(args: Array<String>) {
    val romanizer = Romanizer()
    val reverser = Reverser()
    val midfinder = MedianFinder()
    val actor = NeedleFinder()
    println(midfinder.getMedianOf(nums1 = arrayOf(1, 3), nums2 = arrayOf(2)))
    print(actor.findTheNeedle(needle = "sad", hayStack = "waaasadwaaah"))

//    print(romanizer.romanize(299))
//    print(reverser.reverseWords("hello word."))

}