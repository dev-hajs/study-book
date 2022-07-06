package _18_middle_man;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person jisoo = new Person("jisoo", new Department(nick));
        assertEquals(nick, jisoo.getManager());
    }

}