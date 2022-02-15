package br.com.leorocha.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class StatusDTO {
    private Long id;
    private Integer hp;
    private Integer mp;
    private Integer xp;
    private Long userId;
}
