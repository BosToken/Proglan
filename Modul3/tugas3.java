public class tugas3 {
    static boolean isCube(long input){
        return (Math.round(Math.cbrt(input))*Math.round(Math.cbrt(input)))
                *Math.round(Math.cbrt(input)) == input;
    }
}
