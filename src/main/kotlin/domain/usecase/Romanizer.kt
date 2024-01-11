package domain.usecase

import kotlin.math.floor

class Romanizer {

    var biggestDivisor: Int = 0
    var remainder: Int = 0
    var numberCopy: Int = 0
    var biggestRomanReps = 0
    var result = ""

    private fun appendRoman(romanSymbol: String, number: Int, divisor: Int) {
        if (numberCopy == 9 || numberCopy == 4) {
            val postSymbol = if (numberCopy == 9) "X" else "V"
            biggestDivisor = 0
            result += "I$postSymbol"

        } else {
            biggestDivisor = divisor
            biggestRomanReps = floor(number.toDouble() / biggestDivisor.toDouble()).toInt()
            result += (romanSymbol.repeat(biggestRomanReps.toInt()))
            remainder = number % biggestDivisor
            numberCopy = remainder
        }
    }


    /**
     *
     * identify the bracket the number fits in give the the sealed class possibilities
     * by finding it's biggest divisor among those in the possibilities
     * generate the first roman no.s
     * then do modulus for remnant
     * @author Igadwa
     */

    fun romanize(number: Int): String {
        numberCopy = number

        do {
            when {
                numberCopy <= RomanPossibilities.I.value -> {
                    biggestDivisor = RomanPossibilities.I.value
                    biggestRomanReps = floor(number.toDouble() / biggestDivisor.toDouble()).toInt()
                    result += ("I".repeat(biggestRomanReps.toInt()))
                    remainder = number % biggestDivisor
                    numberCopy = remainder
                }

                numberCopy <= RomanPossibilities.V.value -> {
                    if (numberCopy < RomanPossibilities.V.value) {
                        appendRoman("I", numberCopy, RomanPossibilities.I.value)
                    } else {
                        appendRoman("V", numberCopy, RomanPossibilities.V.value)
                    }
                }

                numberCopy <= RomanPossibilities.X.value -> {
                    if (numberCopy < RomanPossibilities.X.value) {
                        appendRoman("V", numberCopy, RomanPossibilities.V.value)
                    } else {
                        appendRoman("X", numberCopy, RomanPossibilities.X.value)
                    }
                }

                numberCopy <= RomanPossibilities.L.value -> {
                    if (numberCopy < RomanPossibilities.L.value) {
                        appendRoman("X", numberCopy, RomanPossibilities.X.value)
                    } else {
                        appendRoman("L", numberCopy, RomanPossibilities.L.value)
                    }
                }

                numberCopy <= RomanPossibilities.C.value -> {
                    if (numberCopy < RomanPossibilities.C.value) {
                        appendRoman("L", numberCopy, RomanPossibilities.L.value)
                    } else {
                        appendRoman("C", numberCopy, RomanPossibilities.C.value)
                    }
                }

                numberCopy <= RomanPossibilities.D.value -> {
                    if (numberCopy < RomanPossibilities.D.value) {
                        appendRoman("C", numberCopy, RomanPossibilities.C.value)
                    } else {
                        appendRoman("D", numberCopy, RomanPossibilities.D.value)
                    }
                }

                numberCopy <= RomanPossibilities.M.value -> {
                    if (numberCopy < RomanPossibilities.M.value) {
                        appendRoman("D", numberCopy, RomanPossibilities.D.value)
                    } else {
                        appendRoman("M", numberCopy, RomanPossibilities.M.value)
                    }
                }
            }
        } while (biggestDivisor > 1)
        return result
    }


}