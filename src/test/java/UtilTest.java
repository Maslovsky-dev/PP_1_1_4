import jm.task.core.jdbc.util.Util;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class UtilTest {
    @Test
    public void connectionShouldBeNotNull() {
        Connection connection = Util.connectToDB();
        Assert.assertNotNull("Подключение не установлено", connection);
    }
}
