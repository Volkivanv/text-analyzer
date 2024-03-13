import impl.Repository;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository("input.txt");
        try{
        System.out.println(repository.getWords().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}