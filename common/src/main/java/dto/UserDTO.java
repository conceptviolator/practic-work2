package dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDTO {
    private Long id;
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("UserDTO{id=%d, phoneNumber=%s}", id, phoneNumber);
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public UserDTO jsonToObject(String json){

        ObjectMapper mapper = new ObjectMapper();
        UserDTO userdto = null;
        try {
            userdto = mapper.readValue(json, UserDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userdto;
    }
}
