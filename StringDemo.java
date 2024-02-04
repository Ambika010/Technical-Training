public class StringDemo {
    public static void main(String[] args) {
        String name = "Ambika"; //1 object or 0 object i.e. if another string variable contains the same value "Ambika" then new object won't be created it will just refer to the old one
        String name1 = "Ambika".intern();
        System.out.println(name == name1); 
        String name2 = new String("Ambika").intern(); //2 object(with new keyword) or 1 object
        System.out.println(name == name2); //with .intern() method output will be true else false
        //.intern() method specifies whether the object is inside the pool or outside the pool
        //Strings are immutable (very bad if changes are made as it will create new memory everytime)

        StringBuffer sb = new StringBuffer(1000); //mutable i.e best way when there are changes to be made (if capacity is defined then it will increase only when 1000 gets full) capacity can be explicitly applies
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Ambika");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //After 16 there is a new capacity 16*2+2
        //sb.ensureCapacity(1000); (this method is used to fix capacity i.e. not increase till 1000 does not get full)(use when you don't fix the capacity in line no. 11)
        sb.append("hodifusnahbuhijrooruwbhdsuuhw");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //all methods of stringbuffer are synchronized

        //StringBuilder s = new StringBuilder();
        //synchronized(s); //to make synchronized
    }
}