public class tugas1{
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}