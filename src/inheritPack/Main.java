package inheritPack;
public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.size="Large";
        System.out.println(dog.size);
        dog.setInfo("bbb","hhh","jjj",'F',4,"large");
        dog.eat();
        System.out.println(dog);

    }
}
