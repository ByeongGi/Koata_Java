package or.kosta.model;

import java.io.Serializable;

/**
 * Created by kosta on 2015-12-14.
 */
public class Member_Vo implements Serializable{

    private String id;
    private String password;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
