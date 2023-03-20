package AbstractClassCreate;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal_Abstract[] animalAbstracts = {new Cat_Abstract(),new Dog_Abstract()};
        for (Animal_Abstract animalAbstract:animalAbstracts){
            animalAbstract.bark();
        }
    }
}
