package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(  19), "Aged user can't play the game");
    }
    @Test
    public  void testThatTooYongUsersCanNotPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.canPlayGame(17), "Aged user can play the game");
    }

}
