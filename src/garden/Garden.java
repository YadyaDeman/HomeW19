package garden;

import com.sun.source.util.Trees;

public class Garden {
    /*Проект Садовод-любитель. Будем выращивать растения в течение нескольких лет и смотреть что получилось.

            Задача: Выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики:
            -name, height, age
    Каждый из них вырастает за сезон на разную высоту, одинаковую для всех деревьев и всех цветов
    Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда одинаково:
    Для цветов: Сезон начинается весной, зимой они не растут, летом они не растут а цветут, осенью их срезают
    Для деревьев: Сезон начинается весной, зимой они не растут, летом растут, осенью не растут
    В классе Garden  нужно создать метод growPlants()  в котором будет подробно отражен процесс роста
    минимум двух растений ( дерева и цветка) в течение нескольких лет:
    Что происходит зимой, летом весной и осенью их размер в каждое время года и какого они размера и возраста
    в конце.
    Spring - Summer - Autumn - Winter
    Growing plants for 2 years:

    Tulip has grown in Spring, 20
    Tulip is not growing in summer , 20
            ........
            ........
    Pine tree has grown in Summer, 220



    Tulip has height: 25 and is 3 years old
    Pine has height 150 and is 3 years old
    Алгоритм:
            1. Создать три класса. Родительский Plant  и дочерние Flower and Tree
        2. В классах должны быть общие характеристики  name, height, age и поведение, выраженное следующими методами:
    doSpring()
    doSummer()
    doAutumn()
    doWinter()
    Подумать, какие из них лучше обьявить абстрактными а какие реализовать в родительском классе
        3. В методе growPlants  реализовать смену сезонов с помощью цикла/ циклов for each


*/
    public static void main(String[] args) {

        Plant tree=new Tree("Sakura", 0,"sm", 0,"days");
        tree.dontGrow();
        Plant tree1=new Tree("Sakura1",0,"sm",0,"days");
        Plant flower=new Flower("Rose",0,"sm",0,"days");
        flower.dontGrow();




    }
}





