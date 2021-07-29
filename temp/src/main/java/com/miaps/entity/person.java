package com.miaps.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class person {
    @Id
    int pk;
    @Column
    String name;
    @Column
    int d_point;
    @Column
    int s_point;
    @Column
    String udYn; // Up Down
    @Column
    String ioYn; // In Out
}
