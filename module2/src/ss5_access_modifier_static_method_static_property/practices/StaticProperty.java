package ss5_access_modifier_static_method_static_property.practices;

public class StaticProperty {
    private String name;
    private String engine;
    public static int numberOfCars;
    public StaticProperty(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }
    public static void main(String[] args){
        StaticProperty staticProperty1 =new StaticProperty("Mazda 3","Skyectiv 3");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty staticProperty2 =new StaticProperty("Mazda 6","Skyectiv 6");
        System.out.println(StaticProperty.numberOfCars);
    }
}
