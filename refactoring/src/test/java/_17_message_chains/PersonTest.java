package _17_message_chains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void manager() {
        Person jisoo = new Person("jisoo");
        Person nick = new Person("nick");
        jisoo.setDepartment(new Department("m365deploy", nick));

        Person manager = jisoo.getManager();
        assertEquals(nick, manager);
    }

}