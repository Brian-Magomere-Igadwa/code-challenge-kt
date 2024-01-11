package domain.usecase

class Reverser {

    fun reverseWords(sentence: String): String {
        val listOfWords = sentence.split(" ")
        val reversed = listOfWords.reversed()

        val result = reversed.joinToString(separator = " ")
        return result
    }
}