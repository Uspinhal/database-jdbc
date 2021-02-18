package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    // Constructor
    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Hashcode & Equals
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Department)) {
            return false;
        }
        Department department = (Department) o;
        return Objects.equals(id, department.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // Outros métodos
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
