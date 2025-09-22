fun main() {
    val seconds: Int = 660

    val totalMinut = seconds / 60
    val totalHours = totalMinut / 60

    val minutesOstatok = totalMinut % 60
    val hoursOstatok = totalHours % 24

    val minutText = when {
        totalMinut % 10 == 1 && totalMinut % 100 != 11 -> "минуту"
        totalMinut % 10 in 2..4 && totalMinut % 100 !in 12..14 -> "минуты"
        else -> "минут"
    }

    val hourText = when {
        totalHours % 10 == 1 && totalHours % 100 != 11 -> "час"
        totalHours % 10 in 2..4 && totalHours % 100 !in 12..14 -> "часа"
        else -> "часов"
    }

    val result = when {
        seconds <= 60 -> "только что"
        seconds < 3600 -> "$totalMinut $minutText назад"
        seconds < 86400 -> "$totalHours $hourText назад"
        seconds < 172800 -> "вчера"
        seconds < 259200 -> "позавчера"
        else -> "давно"
    }

    println("был(а) $result")
}