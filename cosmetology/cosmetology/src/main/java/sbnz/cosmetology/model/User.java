package sbnz.cosmetology.model;


import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Where(clause = "active=true")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="username",unique = true,nullable = false)
    private String username;

    @Column(name = "password",nullable =false)
    private String password;

    @Column(name="active", nullable = false)
    private boolean active;

    @Column(name="role", nullable=false)
    @Enumerated(EnumType.STRING)
    private Role role;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User() {
    }

    public User(String username, String password, boolean active, Role role) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.role = role;
    }
}
