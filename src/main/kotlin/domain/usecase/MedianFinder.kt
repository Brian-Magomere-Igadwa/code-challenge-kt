package domain.usecase

import kotlin.math.ceil

class MedianFinder {
    fun getMedianOf(nums1: Array<Int>, nums2: Array<Int>): Int {
        val merged = nums1 + nums2

        return merged.sortedArray()[ceil(merged.size / 2.toDouble()).toInt() - 1]
    }
}