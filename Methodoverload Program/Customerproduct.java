public class Customerproduct {
    void product(String p)
    {
        System.out.println("purchased:"+p);
    }
    void product(String p1,String p2)
    {
        System.out.println("purchased:"+p1+" ,"+p2);
    }
    void product(String p1,String p2,String p3)
    {
        System.out.println("purchased:"+p1+" ,"+p2+" ,"+p3);
    }
    public static void main(String[] args) {
        Customerproduct obj=new Customerproduct();
        obj.product("oil");
        obj.product("oil", "shampoo");
        obj.product("oil", "soap", "shampoo");
    }
}
