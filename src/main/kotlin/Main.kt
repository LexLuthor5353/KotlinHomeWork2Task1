fun main() {
    val seconds:Int = 240

    val minute:Int = seconds/60
    val secInMin = minute % 10

    val hours:Int = minute/60
    val minInHours = hours % 10


    var agoToText = when {
        (seconds > 0 && seconds <= 60) -> {println("«был(а) только что»")}
        (seconds > 60 && seconds < 60 * 60 && secInMin == 1) -> {println("«был(а) $minute минуту назад»")}
        (seconds > 60 && seconds < 60 * 60 && secInMin in 2..4) -> {println("«был(а) $minute минуты назад»")}
        (seconds > 60 && seconds < 60 * 60 && minute % 10 == 5 || minute % 10 > 5 || minute % 10 == 0 && minute < 60) -> {println("«был(а) $minute минут назад»")}

        (seconds > 60 * 60 && seconds < 24 * 60 * 60 && minInHours == 1) -> {println("«был(а) $hours час назад»")}
        (seconds > 60 * 60 && seconds < 24 * 60 * 60 && minInHours in 2..4) -> {println("«был(а) $hours часа назад»")}
        (seconds > 60 * 60 && seconds < 24 * 60 * 60 && minInHours == 0) -> {println("«был(а) $hours часов назад»")}

        (seconds > 24 * 60 * 60 && seconds < 48 * 60 * 60) -> {println("«был(а) вчера»")}
        (seconds > 48 * 60 * 60 && seconds < 72 * 60 * 60) -> {println("«был(а) позавчера»" )}
        else -> {println("«был(а) давно»")}
    }



}