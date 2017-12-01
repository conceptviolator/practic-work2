package app;

import dto.UserDTO;

public class Main {
    public static void main(String... args) throws Exception {
        for (int i=0; i<5; i++) {
            System.out.println("Main.main say Hello!!!!");
            UserDTO user = new UserDTO();
            user.setId(45L);
            user.setPhoneNumber("+7 (3822) 900-111");
            System.out.println(user.toJson());
            Thread.sleep(1000);
        }
    }
}
