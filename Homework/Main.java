public class Main{

     public static void main(String []args){
        System.out.println("Task N1");
        
        int a = 56;
        float b = 63.7f;
        String c = " To Java";
        char d = '!';
        Boolean e = true;
        System.out.println("Welcome" + (c+d));
        System.out.println("Integer Number is: " + a);
        System.out.println("Float Number is: " + b);
        System.out.println(e);
        
        
         System.out.println("Task N2");
     
        int x = 123;
        int y = 534;
        int z = 34;
        int w = 4;
         int result = (((x - y)+z)/w);
        System.out.println("Answer is:" +result);
        
        
        System.out.println("Task N3");
        int k = 555;
        int q = 123;
        System.out.println(k < 666 && q > 125);
        System.out.println(k > 234 || q < 323);
        System.out.println(!(k > 345 && q > 23));
        
        
        System.out.println("Task N3");
        int year = 2002;
        int cyear = 2021;
        int age = (cyear - year);
        System.out.println(("ჩემი დაბადების წელია " + year) + ',' + (" ჩემი ასაკია " + age + " წელი"));
}
    }