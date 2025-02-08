package com.devpablo.quickstart;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "casas")
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;

    public Casa() {
    }

    public Casa(Long id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Casa casa = (Casa) object;
        return Objects.equals(id, casa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "com.devpablo.quickstart.Casa{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
