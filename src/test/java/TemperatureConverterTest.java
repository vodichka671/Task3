import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TemperatureConverterTest {
    @Test
    public void convertFtoC() throws Exception {
        TemperatureConverter p = new TemperatureConverter();
        assertEquals(-15.5556,p.convertFtoC(4),0.001);
    }

    @Test
    public void convertCtoF() throws Exception {
        TemperatureConverter p = new TemperatureConverter();
        assertEquals(4,p.convertCtoF(-15.5556),0.001);
    }

    @Test
    public void convertCtoK() throws Exception {
        TemperatureConverter p = new TemperatureConverter();
        assertEquals(277.2,p.convertCtoK(4),0.01);
    }

    @Test
    public void convertKtoC() throws Exception {
        TemperatureConverter p = new TemperatureConverter();
        assertEquals(4,p.convertKtoC(277.2),0.01);

    }

    @Test
    public void convertFtoK() throws Exception {
        TemperatureConverter p = new TemperatureConverter();
        assertEquals(257.594,p.convertFtoK(4),0.1);
    }

    @Test
    public void convertKtoF() throws Exception {
        TemperatureConverter p = new TemperatureConverter();
        assertEquals(4,p.convertKtoF(257.594),0.1);
    }


}
