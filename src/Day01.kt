fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count { it[0] < it[1] }
    }

    fun part2(input: List<Int>): Int {
        return input.windowed(3)
            .windowed(2)
            .count { it[0].sum() < it[1].sum() }
    }

    val numbers = readInput("Day01").map(String::toInt)

    println(part1(numbers))
    print(part2(numbers))
}