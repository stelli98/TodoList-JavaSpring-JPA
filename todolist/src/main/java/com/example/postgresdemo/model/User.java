package com.example.postgresdemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User extends AuditModel {
    @Id
    @GeneratedValue(generator = "user_generator")
    @SequenceGenerator(
            name = "user_generator",
            sequenceName = "user_sequence",
            initialValue = 1
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    @Column(columnDefinition = "text")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
