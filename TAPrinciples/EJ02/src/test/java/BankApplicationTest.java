import org.example.BankApplication;
import org.example.UserAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BankApplicationTest {

    private BankApplication bankApp;

    @BeforeEach
    public void setUp() {
        bankApp = new BankApplication();
        bankApp.addUserAccount("user1", "password1");
        bankApp.addUserAccount("user2", "password2");
    }

    @Test
    public void testGetUserAccountPositive() {
        UserAccount userAccount = bankApp.getUserAccount("user1");
        assertNotNull(userAccount);
        assertEquals("user1", userAccount.getUsername());
        assertEquals("password1", userAccount.getPassword());
    }

    @Test
    public void testGetUserAccountNegative() {
        UserAccount userAccount = bankApp.getUserAccount("nonexistentuser");
        assertNull(userAccount);
    }
}


