import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;
import com.app.classes.helper.GameRunnerHelper;
import com.app.enums.CharacterEnum;
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

        Object obj1 = tester.setCharacterDetails(CharacterEnum.FIRESOLDIER, "John", 38, "England");
        Assert.assertEquals(fireSoldier.getClass(), obj1.getClass());

        Object obj2 = tester.setCharacterDetails(CharacterEnum.PRINCE, "Arthur", 35, "England");
        Assert.assertEquals(prince.getClass(), obj2.getClass());

        Object obj3 = tester.setCharacterDetails(CharacterEnum.PRINCESS, "Mary", 28, "England");
        Assert.assertEquals(princess.getClass(), obj3.getClass());
    }

}


