
import java.util.LinkedHashMap


    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 2, 3, 1)
        val n = arr.size
        printRepeating(arr, n)



    }

fun printRepeating(arr: IntArray, n: Int) {

    val map = LinkedHashMap<Int, Int>()
    for (i in 0 until n) {
        try {
            map[arr[i]] = map[arr[i]]!! + 1
        } catch (e: Exception) {
            map[arr[i]] = 1
        }

    }

    for ((key, value) in map) {
        if (value > 1) {
            print("$key ")
           }
       }

    }


