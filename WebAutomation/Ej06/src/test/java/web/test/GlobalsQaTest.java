package web.test;

import org.testng.annotations.Test;

public class GlobalsQaTest extends BaseTest{

    @Test
    public void FinalTest() throws InterruptedException {
        getFawPage();
        fawPage.ClickHere();
    }
}
