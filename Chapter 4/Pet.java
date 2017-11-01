
    
public class Pet {
    private String name;
    private int age;
    private String favoriteToy;
    
    public Pet(int num, String nm, String ft) {
        this.age = num;
        this.name = nm;
        this.favoriteToy = ft;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return "The pet's name is: " + this.name;
    }
    
}
