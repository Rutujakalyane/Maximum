package generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtFirstPosition() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue = maximumValue.maximum(8, 5, 3);
        Assert.assertEquals((Integer) 8, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtSecondPosition() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue = maximumValue.maximum(5,8,3);
        Assert.assertEquals((Integer) 8, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtThirdPosition() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue = maximumValue.maximum(3,5,8);
        Assert.assertEquals((Integer) 8, maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_ThreeFloats_AtFirstPosition() {
        MaximumValue maximumValue = new MaximumValue();
        Float maxValue = maximumValue.maximum(5.5f,4.4f,8.8f);
        Assert.assertEquals((Float) 8.8f, maxValue);
    }

   
}