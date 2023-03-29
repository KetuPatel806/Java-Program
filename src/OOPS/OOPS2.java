package OOPS;

public class OOPS2 {
    public static void main(String[] args) {
        Details ketu = new Details("ketu", 19, false);
        Details Shivam = new Details("Shivam",20,true);
        Details Manthan = new Details("Manthan",19,false);
        System.out.println(Details.population);
        System.out.println(Details.population);
        System.out.println(Details.population);
    }
}
    class Details {
        String name;
        int age;
        boolean Marriage;
        static int population;

        Details(String name,int age,boolean Marriage){
            this.name = name;
            this.age = age;
            this.Marriage = Marriage;
            population += 1;
        }
    }
