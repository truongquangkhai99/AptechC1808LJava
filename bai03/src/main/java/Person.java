public class Person implements IPlayable, ILearning{
    private String name;
    private String dob;
    private Integer age;

    public Person(String name, String dob, Integer age) {
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public void gotoLibrary() {
        System.out.println("gotoLibrary");
    }

    public void readingBook(String bookName) {
        System.out.println("readingBook");
    }

    public void goCamping() {
        System.out.println("goCamping");
    }

    public void goSwimming() {
        System.out.println("goSwimming");
    }
}
