package Test;

import e1.Logics;
import e1.LogicsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestE1 {

    private Logics logic;
    private static final int SIZE=7;

    @BeforeEach
    void beforeEach()
    {
        this.logic=new LogicsImpl(SIZE);
    }

    @Test
    void testHasKnight(){
        boolean hasKnightSpawned=false;
        for(int rowIndex=0; rowIndex<SIZE; rowIndex++){
            for(int columnIndex=0; columnIndex<SIZE; columnIndex++){
                if(this.logic.hasKnight(rowIndex,columnIndex)){
                    hasKnightSpawned=true;
                }
            }
        }

        assertTrue(hasKnightSpawned);
    }

    @Test
    void testWrongCoordinate


}
