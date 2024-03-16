package test;

public class QueueImplTest {
    @Before
    public void setUp() throws Exception{
        //Inicialitzar una cua i generar una situació (omplint-la)
    }
    @After
    public void tearDown(){this.q = null;}
    @Test
    public void testPush1() throws Exception{
        Assert.assertEquals(expected: 3, this.q.size());
        this.q.push(e: "4");
        Assert.assertEquals(expected: 3, this.q.size()); // expected:valor esperat, valor real
    }
}
