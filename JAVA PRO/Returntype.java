public class Returntype {
    
        int getnumber()
        {
            return 10;
        }
        String getname()
        {
            return ("java");
        }
        double getprice()
        {
            return 99.77;
        }
    public static void main(String[] args) {
        Returntype obj=new Returntype();
        System.out.println(new Returntype().getnumber());
        System.out.println(new Returntype().getname());
        System.out.println(new Returntype().getprice());
    }
}
