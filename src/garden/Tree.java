package garden;

public class Tree extends Plant{
    private String name = "Sakura";
    private int height;
    private static int age;



    public Tree(String name, int height, String sm, int age,String month){
       super(name, height, sm, age,month);
    }



    @Override
    public void Summer() {
        System.out.println(name +" летом растут.");
    }

    @Override
    public void Autumn() {
        System.out.println(name+" осенью не растут.");
    }

    /* doSpring()
    doSummer()
    doAutumn()
    doWinter()*/

    @Override
    public void sezons() {
        super.sezons();
    }
}
