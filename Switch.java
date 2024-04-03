public class Switch { //compares equality
    static int getPrice(){
        String item = "burger";
        switch(item){
            case "burger":
            return 100;
            case "drink":
            return 200;
            default:
            return 0;
        }
    }
    public static void main(String[] args) {
        //Java 14 (colon vs arrows) switch case be used to return 
        //System.out.println(getPrice());
        String item = "burger";
        System.out.println(switch(item){
            case "burger","pizza" -> 100; //arrow is used as return 100
            case "drink" -> 200;
            default -> 0;
            //(in this method there is no need to use the break keyword after each case)
        });
        //JAVA 7 onwards (switch supports string values)
        String item_1 = "burger";
        switch(item_1){
            case "burger":
            System.out.println("Price is Rs.100");
            case "drink":
            System.out.println("Price is Rs.200");
        }
        // int item = 1;
        // final int BURGER=1;
        // final int DRINK=2;
        // final int DESSERT=3;
        // switch(item){
        //     case BURGER:
        //     System.out.println("Price is Rs.100");
        //     case DRINK:
        //     System.out.println("Price is Rs.200");
        //     case DESSERT:
        //     System.out.println("Price is Rs.150");
        //     default:
        //     System.out.println("50% off");
        //}
    }
}
