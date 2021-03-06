package am.basic.notificator.model;


import am.basic.notificator.model.icp.UserStatus;
import lombok.Data;


import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {

    private int id;

    private String name;

    private String surname;

    private String code;

    private String username;

    private String password;

    private UserStatus status;

    private List<Authority> authorities;



}