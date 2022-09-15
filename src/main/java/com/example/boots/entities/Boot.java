package com.example.boots.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import com.example.boots.enums.BootType;

@Entity
@Table(name="BOOTS")
public class Boot {
    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="TYPE")
    @Enumerated(EnumType.STRING)
    private BootType type;

    public BootType getType() {
        return this.type;
    }

    public void setType(BootType type) {
        this.type = type;
    }

    @Column(name="SIZE")
    private Float size;

    public Float getSize() {
        return this.size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    @Column(name="QUANTITY")
    private Integer quantity;

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name="MATERIAL")
    private String material;

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
