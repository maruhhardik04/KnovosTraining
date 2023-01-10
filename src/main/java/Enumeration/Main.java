package Enumeration;

public class Main {

    enum Day {

        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);


        public int dayOfWeek;

        public int getDayOfWeek() {
            return dayOfWeek;
        }
        Day(int dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }


    }


    public static void main(String[] args) {

        Day day = Day.FRIDAY;


        switch(day)
        {
            case MONDAY, THURSDAY, TUESDAY, WEDNESDAY,FRIDAY,SATURDAY,SUNDAY:
                System.out.println(day +" is a "+ day.getDayOfWeek() +" day of week");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;

        }


        for(Day d : Day.values())
        {
            System.out.println(d);
        }


    }


}
