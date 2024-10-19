public class SingleTon1
{
    public static void main(String[] args) {
        Abhi s=Abhi.getAbhi(101,"xyz");
        System.out.println(s);
        
    }
}
class Abhi
{
    private static Abhi a;
    int roll;
    String name;
    private Abhi(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    public static Abhi getAbhi(int roll,String name)
    {
        if(a==null)
        {
            a=new Abhi(roll,name);
        }
        return a;
    }
    public static void main(String[] args) {
        
    }
}