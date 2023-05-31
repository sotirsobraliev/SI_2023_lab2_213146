import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void function() {
        List<User> users = new ArrayList<>();
        User user1 = new User("sotir", "kako12345", null);
        users.add(user1);
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1, users));
        assertTrue(ex.getMessage().contains("Nedostasuvaat informacii"));

        User user2 = new User(null, "kako", "sotir.sobraliev@gmail.com");
        users.add(user2);
        assertFalse(SILab2.function(user2, users));

        User user3 = new User("boris", "123 23123", "elizagmail.com");
        users.add(user3);
        assertFalse(SILab2.function(user3, users));

        User user4 = new User("damjan", "383", "markomarkov@gmail.com");
        users.add(user4);
        assertFalse(SILab2.function(user4, users));

        User user5 = new User("petko", "str ne@ww1", "marce@gmail.com");
        assertFalse(SILab2.function(user5, users));
    }


    @Test
    void multipleConditionsTest(){
        List<User> users = new ArrayList<>();

        User user1 = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1, users));
        assertFalse(ex.getMessage().contains("Nedostasuvaat informacii"));

        User user2 = new User("Sotir", null, "sotir@gmail.com");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2, users));
        assertFalse(ex.getMessage().contains("Nedostasuvaat informacii"));


        User user3 = new User("Boris", "zdravo513", null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user3, users));
        assertFalse(ex.getMessage().contains("Nedostasuvaat informacii"));

        User user4 = new User("Zdravce", "hello353", "zdravko@gmail.com");
        assertTrue(SILab2.function(user4, users));
    }
}

