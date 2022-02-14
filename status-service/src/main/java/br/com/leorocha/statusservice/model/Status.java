package br.com.leorocha.statusservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Status {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer hp;
    private Integer mp;
    private Integer xp;
    private Long userId;
}
