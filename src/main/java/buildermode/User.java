package buildermode;

import com.sun.org.apache.bcel.internal.generic.FNEG;

/**
 * @author: chenhuang
 * @date: 2019/2/22
 * @description:
 */
public class User {
    private final String lastName;
    private final String firstName;
    private int age;
    private String phone;

    private User(UserBuilder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private final String lastName;
        private final String firstName;
        private int age;
        private String phone;

        public UserBuilder(String lastName, String firstName) {
            this.lastName = lastName;
            this.firstName = firstName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user = new UserBuilder("haha", "hehe").age(18).build();
    }
}
