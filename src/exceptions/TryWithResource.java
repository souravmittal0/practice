package exceptions;

//This is just for DEMO purpose
//Try with resource to avoid resource leaking
public class TryWithResource {
    public static void main(String[] args) {
        try(Employee emp = new Employee()) {
            System.out.println(emp.getId());
        }   //Compile time error if the Employee is not implementing AutoClosable
    }
}

class Employee implements AutoCloseable {
    long id;
    String name;

    public Employee() {
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        // TODO document why this method is empty
    }
}
