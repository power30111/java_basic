package AbstractClassCreate;

public class AbstactMain {
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        //recipe 객체를 생성한다. recipe 는 upperClass에 있는 execute()메서드를 실행한다.
        recipe.execute();

        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.execute();
    }
}
