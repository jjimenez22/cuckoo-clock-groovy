# cuckoo-clock-groovy
A simple cuckoo clock application written in Groovy.

When a minute is evenly divisible by three, the clock will say the word "Fizz". When a minute is evenly divisible by five, the clock will say the word "Buzz". When a minute is evenly divisible by both, the clock will say "Fizz Buzz", with two exceptions:

 <ul>
     <li>On the hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo bird will come out and "Cuckoo" between one and twelve times depending on the hour.</li>
 <li>On the half hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo will come out and "Cuckoo" just once.
    <li>With minutes that are not evenly divisible by either three or five, at first you had intended to have the clock just say the numbers ala Fizz Buzz, but then you decided at least for version 1.0 to just have the clock make a quiet, subtle "tick" sound for a little more clock nature and a little less noise.</li>
    <li>Your input will be a string containing hour and minute values in 24-hour time, separated by a colon, and with leading zeros. For example, 1:34 pm would be "13:34".</li>
    <li>Your return value will be a string containing the combination of Fizz, Buzz, Cuckoo, and/or tick sounds that the clock needs to make at that time, separated by spaces. Note that although the input is in 24-hour time, cuckoo clocks' cuckoos are in 12-hour time.</li>
    </ul>

You can run the unit tests by simply running `gradle build` and `gradle test` in a cmd and then check the result in the standard output section of the tests report in `~/build/reports/tests/test/classes/CuckooTest.html`.

Also you can run the application by running directly the `Cuckoo.groovy` file in `~/src/main/groovy/Cuckoo.groovy` with groovy and providing a time as a command line argument with a "hh:mm" format as previously explained. For example:
```
$ groovy Cuckoo.groovy "10:30"
```