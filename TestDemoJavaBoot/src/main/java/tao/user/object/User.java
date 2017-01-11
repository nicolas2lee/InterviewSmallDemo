package tao.user.object;




import tao.common.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by xinrui on 10/01/17.
 */
@Entity
@Table(name="User")
public class User extends AbstractEntity {
    private String username;
    private String email;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
