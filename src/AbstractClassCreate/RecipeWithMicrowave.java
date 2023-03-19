package AbstractClassCreate;

public class RecipeWithMicrowave extends AbstractReceipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the Microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("clean up utensils");
        System.out.println("Switch off the Microwave");
    }
}
