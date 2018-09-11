class CuckooTest extends GroovyTestCase {
    void testMain() {
        for (time in Arrays.asList(
                "13:33",
                "21:00",
                "11:15",
                "03:03",
                "14:30",
                "08:55",
                "00:00",
                "12:00"
        )) {
            println("\"" + time + "\" => " + Cuckoo.getResult(time))
        }
    }
}
