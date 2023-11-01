package ua.digijed2.android.kotlin1

// TODO: Повернути кількість парних цілих чисел у заданому масиві.
//  Примітка: оператор % "mod" обчислює залишок, наприклад, 5 % 2 дорівнює 1.
//  Приклад:
//   countEvens([2, 1, 2, 3, 4]) → 3
//   countEvens([2, 2, 0]) → 3
//   countEvens([1, 3, 5]) → 0
fun countEvens(array: IntArray): Int {
    var count = 0

    for (number in array) {
        if (number % 2 == 0) {
            count++
        }
    }

    return count
}

// TODO: За заданим масивом цілих чисел повернути true, якщо масив не містить жодної 1 та жодної 3.
//  Приклад:
//  lucky13([0, 2, 4]) → true
//  lucky13([1, 2, 3]) → false
//  lucky13([1, 2, 4]) → false
fun lucky13(array: IntArray): Boolean {
    for (number in array) {
        if (number == 1 || number == 3) {
            return false
        }
    }
    return true
}

// TODO: За заданим масивом цілих чисел повернути true, якщо в масиві десь поруч з 2 стоїть ще одна 2.
//  Приклад:
//  has22([1, 2, 2]) → true
//  has22([1, 2, 1, 2]) → false
//  has22([2, 1, 2]) → false
fun has22(array: IntArray): Boolean {
    for (i in 0 until array.size - 1) {
        if (array[i] == 2 && array[i + 1] == 2) {
            return true
        }
    }
    return false
}

// TODO: Ми будемо говорити, що значення знаходиться "всюди" в масиві, якщо для кожної пари
//  сусідніх елементів в масиві, принаймні один з пари є цим значенням.
//  Повернути true, якщо задане значення є скрізь у масиві.
//  Приклад:
//  isEverywhere([1, 2, 1, 3], 1) → true
//  isEverywhere([1, 2, 1, 3], 2) → false
//  isEverywhere([1, 2, 1, 3, 4], 1) → false
fun isEverywhere(array: IntArray, value: Int): Boolean {
    for (i in 0 until array.size - 1) {
        if (array[i] != value && array[i + 1] != value) {
            return false
        }
    }
    return true
}

// TODO: Для заданих масивів nums1 та nums2 однакової довжини, для кожного елемента в nums1
//  розглянути відповідний елемент в nums2 (з тим же індексом).
//  Поверніть кількість разів, коли ці два елементи відрізняються на 2 або менше, але не є рівними.
//  Приклад:
//  matchUp([1, 2, 3], [2, 3, 10]) → 2
//  matchUp([1, 2, 3], [2, 3, 5]) → 3
//  matchUp([1, 2, 3], [2, 3, 3]) → 2
fun matchUp(nums1: IntArray, nums2: IntArray): Int {
    var count = 0

    for (i in nums1.indices) {
        val diff = Math.abs(nums1[i] - nums2[i])
        if (diff > 0 && diff <= 2) {
            count++
        }
    }

    return count
}

// TODO: Для непорожнього масиву повернути true, якщо існує місце, де можна розділити масив так,
//  щоб сума чисел на одній стороні дорівнювала сумі чисел на іншій стороні.
//  Приклад:
//  canBalance([1, 1, 1, 2, 1]) → true
//  canBalance([2, 1, 1, 2, 1]) → false
//  canBalance([10, 10]) → true
fun canBalance(array: IntArray): Boolean {
    val totalSum = array.sum()
    var leftSum = 0

    for (num in array) {
        leftSum += num
        if (leftSum == totalSum - leftSum) {
            return true
        }
    }

    return false
}