package generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    MaximumValue maximumValue = new MaximumValue();
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtFirstPosition() {
        Integer maxValue = maximumValue.maximum(8, 5, 3);
        Assert.assertEquals((Integer) 8, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtSecondPosition() {
        Integer maxValue = maximumValue.maximum(5,8,3);
        Assert.assertEquals((Integer) 8, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtThirdPosition() {
        Integer maxValue = maximumValue.maximum(3,5,8);
        Assert.assertEquals((Integer) 8, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeFloats_AtFirstPosition() {
        Float maxValue = maximumValue.maximum(5.5f,4.4f,8.8f);
        Assert.assertEquals((Float) 8.8f, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeFloats_AtSecondPosition() {
        Float maxValue = maximumValue.maximum(3.5f,8.8f,4.5f);
        Assert.assertEquals((Float) 8.8f, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeFloats_AtThirdPosition() {
        Float maxValue = maximumValue.maximum(5.4f,2.8f,6.9f);
        Assert.assertEquals((Float) 6.9f, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeStrings_AtFirstPosition() {
        String maxValue = (String) maximumValue.maximum("Peach","Apple","Banana");
        Assert.assertEquals((String) "Peach", maxValue);
    }

}