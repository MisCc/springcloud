package com.cloud.dome.pojo;

/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/
import java.io.Serializable;
import java.util.Date;
/*spring:
        datasource:
        url: jdbc:mysql://94.191.44.80:3306/dbtest
        username: root
        password: 123456
        hikari:
        maximum-pool-size: 20
        minimum-idle: 10
        mybatis:
        type-aliases-package: com.leyou.userservice.pojo
@Table(name = "tb_user")*/
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 创建时间
    private Date created;

    // 备注
    private String phone;

    public User() {
    }

    public User(Long id, String username, String password, Date created, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.created = created;
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

