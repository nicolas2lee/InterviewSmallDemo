package tao.user.object;




import tao.common.AbstractEntity;

import javax.persistence.Entity;

/**
 * Created by xinrui on 10/01/17.
 */
@Entity
public class User extends AbstractEntity {
    private String username;
    private String email;

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
}
