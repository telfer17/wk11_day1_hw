import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.remainingPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.remainingToner());
    }

    @Test
    public void canPrint(){
        printer.print(5,5);
        assertEquals(75, printer.remainingPaper());
        assertEquals(25, printer.remainingToner());
    }

    @Test
    public void cantPrintNotEnoughPaper(){
        printer.print(10, 20);
        assertEquals(100, printer.remainingPaper());
        assertEquals(50, printer.remainingToner());
    }

    @Test
    public void cantPrintNotEnoughToner(){
        printer.print(50, 20);
        assertEquals(100, printer.remainingPaper());
        assertEquals(50, printer.remainingToner());
    }

    @Test
    public void refillPaper(){
        printer.print(50, 2);
        printer.paperRefill();
        assertEquals(100, printer.remainingPaper());
    }

}
