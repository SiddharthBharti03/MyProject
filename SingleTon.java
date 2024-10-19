public class SingleTon
{
    
    public static void main(String[] args) {
        // Sid s= Sid.getSid(101, "sid");
        Sid s=Sid.getSid(106,"sid");
        System.out.println(s.roll+" "+s.name);
    }
}
class Sid
{
    int roll;
    String name;
    // private static Sid s=null;
    
    private Sid(int roll,String name)
    {
        this.name=name;
        this.roll=roll;
        
    }
    // public static Sid getSid(int roll,String name)
    // {
    //     if(s==null)
    //     {
    //         s=new Sid(roll, name);
    //     }
    //     return s;
    // }
    
    
    public static Sid getSid(int roll,String name)
        {
            return s;
        }
        
    //     public static void main(String[] args) {
    //     Sid s1=Sid.getSid(101,"siddharth");
    //     System.out.println(s1.name+" "+s1.roll);
    // }
    
   

}