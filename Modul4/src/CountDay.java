public class CountDay {
    public CountDay(int day) {
        int yearCount = 0, mountCount = 0;

        boolean conditonYear = true, conditonMount = true;

        if (!(day < 365)) {
            while (conditonYear) {
                if (day < 365) {
                    conditonYear = false;
                } else {
                    day = day - 365;
                    yearCount++;
                }
            }
        }

        if (!(day < 30)) {
            while (conditonMount) {
                if (day < 30) {
                    conditonMount = false;
                } else {
                    day = day - 30;
                    mountCount++;
                }
            }
        }

        System.out.println("Year : " + yearCount);
        System.out.println("Mount : " + mountCount);
        System.out.println("Day : " + day);
    }
}
