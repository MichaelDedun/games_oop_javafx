package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void testMoveWhenTrue() {
        Cell source = Cell.findBy(2, 7);
        Cell dest = Cell.findBy(4, 5);
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(source);
        logic.add(bishopBlack);
        boolean result = logic.move(source, dest);
        Assert.assertTrue(result);
    }

}
