package designpatterns.builder;

public class Student {

    private int id;
    private String name;
    private int age;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String toString() {
        return "Student [id: " + this.id + ", name: " + this.name + ", age: " + this.age + "]";
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be less than zero.");
            }
            return new Student(this);
        }
    }
}
