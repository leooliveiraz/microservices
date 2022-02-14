package br.com.leorocha.userservice.dto;

public class UserDTO {
    private Long id;
    private String name;
    private boolean validated;

    public UserDTO(Long id, String name, boolean validated) {
        this.id = id;
        this.name = name;
        this.validated = validated;
    }

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

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }
}
