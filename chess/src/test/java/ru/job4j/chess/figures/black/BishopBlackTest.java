package ru.job4j.chess.figures.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class BishopBlackTest {

    @Test
    public void testWay() {
        Cell source = Cell.findBy(2, 7);
        Cell dest = Cell.findBy(4, 5);
        BishopBlack bishopBlack = new BishopBlack(source);
        Cell[] result = bishopBlack.way(source, dest);
        Assert.assertEquals(Cell.findBy(3, 6), result[0]);
        Assert.assertEquals(Cell.findBy(4, 5), result[1]);
    }

    @Test(expected = IllegalStateException.class)
    public void testWrongWay() {
        Cell source = Cell.findBy(2, 7);
        Cell dest = Cell.findBy(4, 0);
        BishopBlack bishopBlack = new BishopBlack(source);
        Cell[] result = bishopBlack.way(source, dest);
    }



}
