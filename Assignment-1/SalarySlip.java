//two members of class : 
//static keyword used - then it's a class member
//without static keyword - then it's a instance member(object should be created to access them in the main function)
//static mei ek hi memory banti hai (static objects are available at the time of class loading) 
//aur instance mei jb jb instance banegi(mtlb object banegi) tb tb memory create hogi
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

import java.text.NumberFormat;
public class SalarySlip {
    static ResourceBundle rb; //to read the properties file
    //Load
    static void loadBundle(){
        rb=ResourceBundle.getBundle("message", locale);
    }

    //I18N
    //Locale class is used
    static Locale locale;
    static String formatCurrency(double unformattedVal){
        //Numberformat is an abstract class so it,s object will not be created as it acts as a base class
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale); //100000 --> 1,00,000 (numberformat is a predifned class in java in the java.text package) based on locale it will convert the number into desired format
        return nf.format(unformattedVal); //$100,000.00 (this is converted into a string)
    }

    static String dateFormat(){
        Date date = new Date(); //prints date according to your system
        //System.out.println(d);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
        return df.format(date);
    }
    
    //rAm kuMAr ShARMA ---> Ram Kumar Sharma
    static String properCase(String name){
        String names[] = name.split(" "); //split the name according to spaces and stores in array (names[0]="rAm" names[1]="kuMAR" names[2]="ShARMA")
        String fullname = "";
        for(int i=0;i<names.length;i++){
            String n = names[i];
            char firstLetter = n.charAt(0); //bcz first letter of the name is to be capital so we have accessed it (rAm then r=0)
            String firstLetterUpperCase = String.valueOf(firstLetter).toUpperCase(); //first converting char to string then applying the pre-defined string function
            String remString = n.substring(1).toLowerCase(); //all other remaining letters into small letters(first defining the beginning index with the method n.substring(1) then applyting toLowerCase method)
            String result = firstLetterUpperCase + remString + " ";
            fullname = fullname + result;
        }
        return fullname;
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for English:");
        System.out.println("हिंदी के लिए 2 दबाएँ:");
        int choice = sc.nextInt();
        if(choice == 1){
            locale = new Locale("en","US"); //based on ISO code
        }
        else if (choice == 2){
            locale = new Locale("hi","IN");
        }
        loadBundle();
        System.out.print(rb.getString("id.msg"));
        int id = sc.nextInt(); //1001 \n
        sc.nextLine(); //eat \n
        System.out.print(rb.getString("name.msg"));
        String name = sc.nextLine();
        System.out.print(rb.getString("salary.msg"));
        double b_salary = sc.nextDouble();
        compute(id,name,b_salary);
        sc.close();
    }
    static void compute(int id, String name, double b_salary){
        //Allowances
        double hra = b_salary * 0.50; //50% of basic salary
        double ta = b_salary * 0.40;
        double ma = b_salary * 0.25;
        double da = b_salary * 0.20;
        double pf = b_salary * 0.05;
        print(id,name,b_salary,hra,da,ta,ma,pf);
    }
    static void print(int id,String name,double b_salary,double hra,double da,double ta,double ma,double pf){
        //print 
        loadBundle();
        System.out.println(rb.getString("date.msg")+dateFormat());
        System.out.println(rb.getString("printID.msg")+id);
        System.out.println(rb.getString("printName.msg")+properCase(name));
        System.out.println(rb.getString("printSalary.msg")+formatCurrency(b_salary));
        System.out.println(rb.getString("earning.msg")+"\t\t"+rb.getString("deduction.msg"));
        System.out.println(rb.getString("hra.msg")+formatCurrency(hra)+"\t\t"+rb.getString("pf.msg")+formatCurrency(pf));
        System.out.println(rb.getString("da.msg")+formatCurrency(da));
        System.out.println(rb.getString("ta.msg")+formatCurrency(ta));
        System.out.println(rb.getString("ma.msg")+formatCurrency(ma));
        // System.out.println("Deduction Allowances : ");
        // System.out.println("PF : "+pf);
    }
    public static void main(String[] args) {
        input();
    }
}