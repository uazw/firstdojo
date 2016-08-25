import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommyDojoTest {

    @org.junit.Test
    public void shouldReturnConsonantForConsonant()  {
        assertEquals("h",new MommyDojo("H").translate());
    }

    @Test
    public void shouldReturnMommyForVowel() throws Exception {
        assertEquals("mommy",new MommyDojo("a").translate());
    }

    @Test
    public void shouldReturnEmptyStringForEmptyString()
    {
        assertEquals("",new MommyDojo("").translate());
    }

    @Test
    public void shouldReplaceMommyForVowel() throws Exception {

        assertEquals("hmommy",new MommyDojo("ha").translate());
    }

    @Test
    public void shouldReplaceConsecutiveVowelsWithMommy(){
        assertEquals("mommy",new MommyDojo("ae").translate());
    }

    @Test
    public void shouldReplaceNonConsecutiveVowelsWithMommy() throws Exception {
        assertEquals("hmommyrmommy",new MommyDojo("here").translate());
    }

    @Test
    public void shouldReplaceConsecutiveVowelsInAWordWithMommy() throws Exception {
        assertEquals("hmommyr",new MommyDojo("hear").translate());
    }

    @Test
    public void shouldNotReplaceIfNumberOfVowelsAreLessThanThirtyPercent() throws Exception {
        assertEquals("hard",new MommyDojo("hard").translate());
    }
}
