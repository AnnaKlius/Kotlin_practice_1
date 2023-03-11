package ua.digijed2.android.kotlin1

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun sleepInTest() {
        assertEquals(true, sleepIn(false, false))
        assertEquals(false, sleepIn(true, false))
        assertEquals(true, sleepIn(false, true))
        assertEquals(true, sleepIn(true, true))
    }

    @Test
    fun parrotTroubleTest() {
        assertEquals(true, parrotTrouble(true, 6))
        assertEquals(false, parrotTrouble(true, 7))
        assertEquals(false, parrotTrouble(false, 6))
        assertEquals(true, parrotTrouble(true, 21))
        assertEquals(false, parrotTrouble(false, 21))
        assertEquals(false, parrotTrouble(false, 20))
        assertEquals(true, parrotTrouble(true, 23))
        assertEquals(false, parrotTrouble(false, 23))
        assertEquals(false, parrotTrouble(true, 20))
        assertEquals(false, parrotTrouble(false, 12))
    }

    @Test
    fun makeBricksTest() {
        assertEquals(true, makeBricks(3, 1, 8))
        assertEquals(false, makeBricks(3, 1, 9))
        assertEquals(true, makeBricks(3, 2, 10))
        assertEquals(true, makeBricks(3, 2, 8))
        assertEquals(false, makeBricks(3, 2, 9))
        assertEquals(true, makeBricks(6, 1, 11))
        assertEquals(false, makeBricks(6, 0, 11))
        assertEquals(true, makeBricks(1, 4, 11))
        assertEquals(true, makeBricks(0, 3, 10))
        assertEquals(false, makeBricks(1, 4, 12))
        assertEquals(true, makeBricks(3, 1, 7))
        assertEquals(false, makeBricks(1, 1, 7))
        assertEquals(true, makeBricks(2, 1, 7))
        assertEquals(true, makeBricks(7, 1, 11))
        assertEquals(true, makeBricks(7, 1, 8))
    }

    @Test
    fun luckySumTest() {
        assertEquals(6, luckySum(1, 2, 3))
        assertEquals(3, luckySum(1, 2, 13))
        assertEquals(1, luckySum(1, 13, 3))
        assertEquals(1, luckySum(1, 13, 13))
        assertEquals(13, luckySum(6, 5, 2))
        assertEquals(0, luckySum(13, 2, 3))
        assertEquals(0, luckySum(13, 2, 13))
        assertEquals(0, luckySum(13, 13, 2))
        assertEquals(13, luckySum(9, 4, 2))
        assertEquals(8, luckySum(8, 13, 2))
        assertEquals(10, luckySum(7, 2, 1))
        assertEquals(6, luckySum(3, 3, 13))
    }

    @Test
    fun evenlySpacedTest() {
        assertEquals(true, evenlySpaced(2, 4, 6))
        assertEquals(true, evenlySpaced(4, 6, 2))
        assertEquals(false, evenlySpaced(4, 6, 3))
        assertEquals(true, evenlySpaced(6, 2, 4))
        assertEquals(false, evenlySpaced(6, 2, 8))
        assertEquals(true, evenlySpaced(2, 2, 2))
        assertEquals(false, evenlySpaced(2, 2, 3))
        assertEquals(true, evenlySpaced(9, 10, 11))
        assertEquals(true, evenlySpaced(10, 9, 11))
        assertEquals(false, evenlySpaced(10, 9, 9))
        assertEquals(false, evenlySpaced(2, 4, 4))
        assertEquals(false, evenlySpaced(2, 2, 4))
        assertEquals(false, evenlySpaced(3, 6, 12))
        assertEquals(false, evenlySpaced(12, 3, 6))
    }

    @Test
    fun countEvensTest() {
        assertEquals(3, countEvens(intArrayOf(2, 1, 2, 3, 4)))
        assertEquals(3, countEvens(intArrayOf(2, 2, 0)))
        assertEquals(0, countEvens(intArrayOf(1, 3, 5)))
        assertEquals(0, countEvens(intArrayOf()))
        assertEquals(1, countEvens(intArrayOf(11, 9, 0, 1)))
        assertEquals(2, countEvens(intArrayOf(2, 11, 9, 0)))
        assertEquals(1, countEvens(intArrayOf(2)))
        assertEquals(2, countEvens(intArrayOf(2, 5, 12)))
    }

    @Test
    fun lucky13Test() {
        assertEquals(true, lucky13(intArrayOf(0, 2, 4)))
        assertEquals(false, lucky13(intArrayOf(1, 2, 3)))
        assertEquals(false, lucky13(intArrayOf(1, 2, 4)))
        assertEquals(true, lucky13(intArrayOf(2, 7, 2, 8)))
        assertEquals(false, lucky13(intArrayOf(2, 7, 1, 8)))
        assertEquals(false, lucky13(intArrayOf(3, 7, 2, 8)))
        assertEquals(false, lucky13(intArrayOf(2, 7, 2, 1)))
        assertEquals(false, lucky13(intArrayOf(1, 2)))
        assertEquals(true, lucky13(intArrayOf(2, 2)))
        assertEquals(true, lucky13(intArrayOf(2)))
        assertEquals(false, lucky13(intArrayOf(3)))
        assertEquals(true, lucky13(intArrayOf()))
    }

    @Test
    fun has22Test() {
        assertEquals(true, has22(intArrayOf(1, 2, 2)))
        assertEquals(false, has22(intArrayOf(1, 2, 1, 2)))
        assertEquals(false, has22(intArrayOf(2, 1, 2)))
        assertEquals(true, has22(intArrayOf(2, 2, 1, 2)))
        assertEquals(false, has22(intArrayOf(1, 3, 2)))
        assertEquals(true, has22(intArrayOf(1, 3, 2, 2)))
        assertEquals(true, has22(intArrayOf(2, 3, 2, 2)))
        assertEquals(true, has22(intArrayOf(4, 2, 4, 2, 2, 5)))
        assertEquals(false, has22(intArrayOf(1, 2)))
        assertEquals(true, has22(intArrayOf(2, 2)))
        assertEquals(false, has22(intArrayOf(2)))
        assertEquals(false, has22(intArrayOf()))
        assertEquals(true, has22(intArrayOf(3, 3, 2, 2)))
        assertEquals(false, has22(intArrayOf(5, 2, 5, 2)))
    }

    @Test
    fun isEverywhereTest() {
        assertEquals(true, isEverywhere(intArrayOf(1, 2, 1, 3), 1))
        assertEquals(false, isEverywhere(intArrayOf(1, 2, 1, 3), 2))
        assertEquals(false, isEverywhere(intArrayOf(1, 2, 1, 3, 4), 1))
        assertEquals(true, isEverywhere(intArrayOf(2, 1, 2, 1), 1))
        assertEquals(true, isEverywhere(intArrayOf(2, 1, 2, 1), 2))
        assertEquals(false, isEverywhere(intArrayOf(2, 1, 2, 3, 1), 2))
        assertEquals(true, isEverywhere(intArrayOf(3, 1), 3))
        assertEquals(false, isEverywhere(intArrayOf(3, 1), 2))
        assertEquals(true, isEverywhere(intArrayOf(3), 1))
        assertEquals(true, isEverywhere(intArrayOf(), 1))
        assertEquals(true, isEverywhere(intArrayOf(1, 2, 1, 2, 3, 2, 5), 2))
        assertEquals(false, isEverywhere(intArrayOf(1, 2, 1, 1, 1, 2), 2))
        assertEquals(false, isEverywhere(intArrayOf(2, 1, 2, 1, 1, 2), 2))
        assertEquals(false, isEverywhere(intArrayOf(2, 1, 2, 2, 2, 1, 1, 2), 2))
        assertEquals(true, isEverywhere(intArrayOf(2, 1, 2, 2, 2, 1, 2, 1), 2))
        assertEquals(true, isEverywhere(intArrayOf(2, 1, 2, 1, 2), 2))
    }

    @Test
    fun matchUpTest() {
        assertEquals(2, matchUp(intArrayOf(1, 2, 3), intArrayOf(2, 3, 10)))
        assertEquals(3, matchUp(intArrayOf(1, 2, 3), intArrayOf(2, 3, 5)))
        assertEquals(2, matchUp(intArrayOf(1, 2, 3), intArrayOf(2, 3, 3)))
        assertEquals(1, matchUp(intArrayOf(5, 3), intArrayOf(5, 5)))
        assertEquals(2, matchUp(intArrayOf(5, 3), intArrayOf(4, 4)))
        assertEquals(1, matchUp(intArrayOf(5, 3), intArrayOf(3, 3)))
        assertEquals(1, matchUp(intArrayOf(5, 3), intArrayOf(2, 2)))
        assertEquals(1, matchUp(intArrayOf(5, 3), intArrayOf(1, 1)))
        assertEquals(0, matchUp(intArrayOf(5, 3), intArrayOf(0, 0)))
        assertEquals(0, matchUp(intArrayOf(4), intArrayOf(4)))
        assertEquals(1, matchUp(intArrayOf(4), intArrayOf(5)))
    }

    @Test
    fun canBalanceTest() {
        assertEquals(true, canBalance(intArrayOf(1, 1, 1, 2, 1)))
        assertEquals(false, canBalance(intArrayOf(2, 1, 1, 2, 1)))
        assertEquals(true, canBalance(intArrayOf(10, 10)))
        assertEquals(true, canBalance(intArrayOf(10, 0, 1, -1, 10)))
        assertEquals(true, canBalance(intArrayOf(1, 1, 1, 1, 4)))
        assertEquals(false, canBalance(intArrayOf(2, 1, 1, 1, 4)))
        assertEquals(false, canBalance(intArrayOf(2, 3, 4, 1, 2)))
        assertEquals(true, canBalance(intArrayOf(1, 2, 3, 1, 0, 2, 3)))
        assertEquals(false, canBalance(intArrayOf(1, 2, 3, 1, 0, 1, 3)))
        assertEquals(false, canBalance(intArrayOf(1)))
        assertEquals(true, canBalance(intArrayOf(1, 1, 1, 2, 1)))
    }
}