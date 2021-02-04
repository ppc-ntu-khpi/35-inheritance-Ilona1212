package domain;

public class Pig extends Predator {
	
	private static final String DEFAULT_KIND = "A pig";
	
	private String kind;
	
	public Pig(String name, int age, int weight, String kind) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = kind;
    }
	
	public Pig(String name, int age, int weight) {
		this(name, age, weight, DEFAULT_KIND);
    }
	
	public Pig() {
        this("DefaultBird", -1, -1, DEFAULT_KIND);
    }
	
    @Override
    public void hunt() {
        System.out.println("Eats everything...");
    }
    
    @Override
    public void speak() {
    	System.out.println("Pig speaking...");
    }
    
    @Override
    public void eat() {
        System.out.println("Pig eats...");
    }
    
    public void run() {
    	System.out.println("Pig can run...");
    }
    
    @Override
    public String toString() {
    	return super.toString() + "\nKind:\t" + kind + "\n\nLarge black pig ;)";
    }
}
