package ua.digijed2.android.kotlin1

// TODO: Параметр weekday має значення true, якщо це будній день,
//  а параметр vacation має значення true, якщо ми у відпустці.
//  Ми спимо, якщо це не будній день або ми у відпустці.
//  Повертаємо true, якщо ми спимо.
//  Приклад:
//  sleepIn(false, false) → true
//  sleepIn(true, false) → false
//  sleepIn(false, true) → true
fun sleepIn(weekday: Boolean, vacation: Boolean): Boolean {
    return !weekday || vacation
}

// TODO: У нас є папуга, який голосно розмовляє. Параметр "hour" - це поточна година
//  в діапазоні 0..23. Якщо папуга розмовляє, а година до 7 або після 20, то у нас проблеми.
//  Поверніть true, якщо ми в біді.
//  Приклад:
//  parrotTrouble(true, 6) → true
//  parrotTrouble(true, 7) → false
//  parrotTrouble(false, 6) → false
fun parrotTrouble(talking: Boolean, hour: Int): Boolean {
    return talking && (hour < 7 || hour > 20)
}

// TODO: Ми хочемо скласти ряд цеглинок завдовжки goal сантиметрів.
//  У нас є декілька маленьких цеглинок (1 сантиметр кожна) та великих цеглинок (5 сантиметрів кожна).
//  Поверніть true, якщо можна скласти ряд з заданих цеглинок.
//  Приклад:
//  makeBricks(3, 1, 8) → true
//  makeBricks(3, 1, 9) → false
//  makeBricks(3, 2, 10) → true
fun makeBricks(small: Int, big: Int, goal: Int): Boolean {
    val maxBigLength = big * 5
    val remainingGoal = goal - maxBigLength
    return small >= remainingGoal && remainingGoal >= 0
}

// TODO: За заданими 3 значеннями типу Int, a b c, повернути їх суму. Однак, якщо одне зі
//  значень дорівнює 13, то воно не враховується у сумі, і значення праворуч від нього не
//  враховуються. Наприклад, якщо b дорівнює 13, то і b, і c не враховуються.
//  Приклад:
//  luckySum(1, 2, 3) → 6
//  luckySum(1, 2, 13) → 3
//  luckySum(1, 13, 3) → 1
fun luckySum(a: Int, b: Int, c: Int): Int {
    if (a == 13) {
        return 0
    } else if (b == 13) {
        return a
    } else if (c == 13) {
        return a + b
    }
    return a + b + c
}

// TODO: Задано три числа a b c, одне з яких є малим, друге - середнім, а третє - великим.
//  Поверніть true, якщо ці три значення рівномірно розподілені, тобто різниця між малим і середнім
//  значеннями така ж, як і між середнім і великим
//  (спочатку вам потрібно знайти, яке число є малим, середнім та великим)
//  Приклад:
//  evenlySpaced(2, 4, 6) → true
//  evenlySpaced(4, 6, 2) → true
//  evenlySpaced(4, 6, 3) → false
fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
    val min = minOf(a, b, c)
    val max = maxOf(a, b, c)
    val mid = a + b + c - min - max

    return mid - min == max - mid
}