class Cuckoo {
    static private StringBuilder message
    static private boolean space

    static void main(String[] args) {
        println(getResult(args[0]))
    }

    static String getResult(String time) {
        message = new StringBuilder("\"")
        space = false
        if (checkFormat(time)) {
            Integer minutes = getMinutes(time)
            Integer hours = getHours(time)

            if (hours == 0) {
                hours = 12
            } else if (hours >= 13)
                hours -= 12
            if (minutes == 0) {
                for (ignored in 1..hours)
                    cuckoo()
            } else if (minutes == 30) {
                cuckoo()
            } else if (minutes % 3 != 0 && minutes % 5 != 0) {
                tick()
            } else {
                if (minutes % 3 == 0)
                    fizz()
                if (minutes % 5 == 0)
                    buzz()
            }
        }

        return message.append("\"").toString()
    }

    private static int getHours(String time) {
        Integer.valueOf(time.substring(0, 2))
    }

    private static int getMinutes(String time) {
        Integer.valueOf(time.substring(3, 5))
    }

    private static boolean checkFormat(String time) {
        if (time ==~ '^[0-2][0-9]:[0-5][0-9]$') {
            return true
        }
        message.append("Wrong format, expected \"hh:mm\"")
        return false
    }

    private static space() {
        message.append(" ")
    }

    private static cuckoo() {
        if (space)
            space()
        message.append("Cuckoo")
        space = true
    }

    private static tick() {
        message.append("tick")
    }

    private static fizz() {
        message.append("Fizz")
        space = true
    }

    private static buzz() {
        if (space)
            space()
        message.append("Buzz")
    }
}
