public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Mini", 2, 8.8, "Yellow");
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Luna", 7, 10.3, "Black");
        cat2.introduce();
        cat2.printCatInfo();
    }
}
