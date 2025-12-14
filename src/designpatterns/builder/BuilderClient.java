package designpatterns.builder;

public class BuilderClient {

    public static void main(String[] args) {
        Student student = Student.builder()
                .setId(1)
                .setName("SM")
                .setAge(30)
                .build();
        System.out.println(student);
    }
}
