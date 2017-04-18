package com.app.classes.factory;

import com.app.classes.abstracts.Fighter;
import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;
import com.app.enums.CharacterEnum;

import static com.app.enums.CharacterEnum.*;

/**
 * Created by pivithuru on 4/18/17 12:30 PM.
 */
public class FighterFactory {
    public Fighter getFighter(CharacterEnum characterId) {
        if (characterId == FIRESOLDIER) {
            return new FireSoldier();
        } else if (characterId == PRINCE) {
            return new Prince();
        } else if (characterId == PRINCESS) {
            return new Princess();
        }
        return null;
    }
}
