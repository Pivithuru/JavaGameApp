import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;
import com.app.classes.enums.Variable;
import com.app.classes.helper.GameRunnerHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pivithuru on 4/5/17 12:39 PM.
 */

public class GameRunnerHelperTest {

    @Test
    public void setCharacterDetailsShouldReturnGivenTypeOfObjectAccordingToValueOfTheEnum() {
        GameRunnerHelper tester = new GameRunnerHelper();
        FireSoldier fireSoldier = new FireSoldier();
        Prince prince = new Prince();
        Princess princess = new Princess();

        Object obj1 = tester.setCharacterDetails(Variable.FIRESOLDIER, "John", 38, "England");
        Assert.assertEquals(fireSoldier.getClass(), obj1.getClass());

        Object obj2 = tester.setCharacterDetails(Variable.PRINCE, "Arthur", 35, "England");
        Assert.assertEquals(prince.getClass(), obj2.getClass());

        Object obj3 = tester.setCharacterDetails(Variable.PRINCESS, "Mary", 28, "England");
        Assert.assertEquals(princess.getClass(), obj3.getClass());

        Object obj4 = tester.setCharacterDetails(Variable.SWORDFIGHT, "Mary", 28, "England");
        Assert.assertEquals(null, obj4);

    }

}


