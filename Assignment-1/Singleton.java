//class ke sare member ko static bnane se main class li loading time bhad jati hai
//singleton acheive krna mtlb poore program mei ek object banti hai
class Email{
    static Email obj; //default value is null
    private Email(){ //constructor

    }
    static Email getInstance(){
        if(obj == null){
            obj = new Email();
        }
        return obj;
    }
}
public class Singleton {
    public static void main(String[] args) {
        // Email email = new Email();
        // Email email2 = new Email();
        // Email email3 = new Email();
        Email e1 = Email.getInstance();
        Email e2 = Email.getInstance();
        Email e3 = Email.getInstance();
        System.out.println(e1 == e2 && e1 == e3);
    }
}
//this program saves memory