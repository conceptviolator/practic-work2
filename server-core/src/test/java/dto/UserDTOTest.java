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

}
