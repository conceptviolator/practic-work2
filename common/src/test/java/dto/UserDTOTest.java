package dto;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class UserDTOTest {

    @Test
    public void userToString() throws Exception {
        UserDTO user = new UserDTO();
        user.setId(12L);
        user.setPhoneNumber("+7 495 727-47-47");
        assertTrue(user.toString().contains("495"));
    }

    @Test
    public void jsonToObject() throws Exception {
        UserDTO user = new UserDTO();
        user.setId(1234567890L);
        user.setPhoneNumber("+7 495 727-47-47");
        assertTrue(user.jsonToObject(user.toJson()).toString().contains("1234567890"));

    }
}
