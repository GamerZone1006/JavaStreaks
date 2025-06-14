public class opps7 {

    enum Day{
        Monday, Tuesday, Wednesday, Thrus, Fri, Sat, Sun
    }

    public static void main(String[] args) {
        // Collections: ArrayList, LinkedList, Vectors

        Day today = Day.Fri;
        switch (today) {
            case Monday:
                System.out.println("arey yarrr");
                break;
            case Sun:
                System.out.println("yayyyy");
                break;
            default:
                System.out.println("arey yarr");
                break;
        }
    }
}
