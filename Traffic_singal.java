public class Traffic_singal {
    public static void main(String[] args) {
        String color = "green";

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("GET READY");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid traffic light color");
        }
    }
}
