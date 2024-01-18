package domain.usecase

class NeedleFinder {
    fun findTheNeedle(needle: String, hayStack: String): Int {
        return hayStack.indexOf(needle)
    }
}