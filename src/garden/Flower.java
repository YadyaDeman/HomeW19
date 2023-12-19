package garden;

public class Flower extends Plant{
    private String name="Rose";
    private int height;
    private static int age;

    public Flower(String name, int height, String sm, int age,String month){
        super(name, height, sm, age,month);
    }

    @Override
    public void Summer() {
        System.out.println(name+ " летом они не растут а цветут.");
    }

    @Override
    public void Autumn() {
        System.out.println(name+" осенью их срезают.");
    }
}
