package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformationTest {

    private Information Information;

    @BeforeEach
    void setUp() {
        Information = new Information();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToBinary() {
        assertEquals("1000",Information.convertToBinary(8));
        assertEquals("10000",Information.convertToBinary(16));
        assertEquals("110011100100110001111",Information.convertToBinary(1689999));
    }



    @Test
    public void sum() {
        Information klik = new Information();
        assertEquals("5", klik.sum("2","3"));
        assertEquals("7", klik.sum("0","7"));
        assertEquals("3", klik.sum("3","0"));
        assertEquals("12", klik.sum("7","5"));
        assertEquals("50", klik.sum("2","48"));
        assertEquals("60", klik.sum("41","19"));
        assertEquals("0", klik.sum("0","0"));
        assertEquals("10000", klik.sum("14","9986"));

        assertEquals("430061", klik.sum("8542","421519"));
        assertEquals("854500868128471", klik.sum("854458755569952","42112558519"));
        assertEquals("589745325703065336202612534970884", klik.sum("589745325698854123654789965412365","4211212547822569558519"));
        assertEquals("456666565656548644548645612154864564153123123214463549852812999298907998911800928009346284790242", klik.sum("456666565656548644548645612154864564153123123172351424374537453753453453457237142371523715231723","42112125478275545545454545454563785637822569558519"));
        assertEquals("99999994494445445545454564545645645612121564856456231185648482121568845452315548545612315515646875153123156748678643132153156478674613161564864564564563300000025555055500550505022648523931", klik.sum("78965412","99999994494445445545454564545645645612121564856456231185648482121568845452315548545612315515646875153123156748678643132153156478674613161564864564564563300000025555055500550505022569558519"));
        assertEquals("123456789254120000000000000000000000000000055555555556555555677101196756756759008672346736376685991123658998745214598785488565635343504045375354345345290024681626861260779026014975", klik.sum("1000000121545645645645647897561235625265574871123658998745214598785488565646454615156486465456456445478933214545645456456456456","123456789254120000000000000000000000000000055555555555555555555555551111111111111111111111111111119999999999999999999999999999988888888888888888888888844545748412315615322569558519"));

        assertNull(klik.sum(null,"15"));
        assertNull(klik.sum(null,null));
        assertNull(klik.sum("256",""));
        assertNull(klik.sum("",null));
        assertNull(klik.sum("-45","10"));
        assertNull(klik.sum("897","+41"));

        assertNull(klik.sum("sedem","698"));
        assertNull(klik.sum("4521#","20"));
        assertNull(klik.sum("0.8","1256"));
        assertNull(klik.sum("11452","12 5"));
        assertNull(klik.sum("9885","45632455655222y8"));
        assertNull(klik.sum("125468","1232 54410"));
        assertNull(klik.sum("a9885","45632455655222y8"));
        assertNull(klik.sum("8x","12"));
        assertNull(klik.sum("27"," "));
    }
}