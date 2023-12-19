package garden;
//import java.lang.String;

public abstract class Plant {
    private String name;
    private int height;
    private String sm="";
    private int age;
    private String month="";

    public Plant(String name, int height, String sm,int age ,String month){
        this.height= height;
        this.sm=sm;
        this.age= age;
        this.name=name;
        this.month=month;
    }
    public void Spring(){
        System.out.println("");
    }
     public abstract void Summer();

     public abstract void Autumn();

    public void Winter(){
        System.out.println("");
    }
    public void dontGrow(){
        Spring();
        Winter();
        System.out.println(name +" cезон начинается весной, зимой не растут");
    }

    public String getName() {
        return name;
    }
    public int getHeight(){
        return height;
    }

    public int getAge() {
        return age;
    }

    public void sezons() {
        Spring();
        Summer();
        Autumn();
        Winter();
    }


}
