public class Sport {
    void playercount(){}
}
class Cricket extends Sport{
   void playercount(){
       System.out.println("11");
   }
}
class Football extends Sport{
    Football(String x){
        System.out.println("Team:-"+x);
    }
}
class OneBounce extends Cricket{
    @Override
    void playercount() {
        super.playercount();
        System.out.println("Java Class One Bounce Team!");
    }
}
class Rugby extends Sport{
    Rugby(String x){
        System.out.println("Team:-"+ x);
        System.out.println("11");
    }
}
class Test3{
    public static void main(String[] args) {
        Sport s;
        s = new Cricket();
        s.playercount();
        s = new Football("Alnser");
        s.playercount();
        s = new Rugby("New Zealand");
        s.playercount();
        Cricket c = new OneBounce();
        c.playercount();
    }
}