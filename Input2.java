public class Input2 {
    public static void main(String[] args) {
        System.out.println("Enter the password : ");
        char pwd[] = System.console().readPassword();//char array is not readable(values are in the form of hash codes) so for reading convert into string
        String q = "Hello";
        System.out.println(pwd.toString());
    }
}   