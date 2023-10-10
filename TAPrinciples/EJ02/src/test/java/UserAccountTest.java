import org.example.UserAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserAccountTest {

    @Test
    public void testDeposit() {
        UserAccount userAccount = new UserAccount("testuser", "testpassword");
        userAccount.deposit(100.0);
        assertEquals(100.0, userAccount.getBalance());
    }

    @Test
    public void testWithdrawSufficientFunds() {
        UserAccount userAccount = new UserAccount("testuser", "testpassword");
        userAccount.deposit(100.0);
        assertTrue(userAccount.withdraw(50.0));
        assertEquals(50.0, userAccount.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        UserAccount userAccount = new UserAccount("testuser", "testpassword");
        userAccount.deposit(50.0);
        assertFalse(userAccount.withdraw(100.0));
        assertEquals(50.0, userAccount.getBalance());
    }

    @Test
    public void testTransferSufficientFunds() {
        UserAccount userAccount1 = new UserAccount("user1", "password1");
        UserAccount userAccount2 = new UserAccount("user2", "password2");
        userAccount1.deposit(100.0);
        assertTrue(userAccount1.transfer(userAccount2, 50.0));
        assertEquals(50.0, userAccount1.getBalance());
        assertEquals(50.0, userAccount2.getBalance());
    }

    @Test
    public void testTransferInsufficientFunds() {
        UserAccount userAccount1 = new UserAccount("user1", "password1");
        UserAccount userAccount2 = new UserAccount("user2", "password2");
        userAccount1.deposit(50.0);
        assertFalse(userAccount1.transfer(userAccount2, 100.0));
        assertEquals(50.0, userAccount1.getBalance());
        assertEquals(0.0, userAccount2.getBalance());
    }
}
