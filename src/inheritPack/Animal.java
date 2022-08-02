package inheritPack;
public class Animal {
    public String name, breed, color;
    public char gender;
    public int age;
    public String size;

    public void setInfo(String name, String breed, String color, char gender, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.size = size;
    }

    public void eat(){
        System.out.println(name+" is eating.");
    }
    public void drink(){
        System.out.println(name+" is drinking.");
    }
    public void move(){
        System.out.println(name+" is moving.");
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
