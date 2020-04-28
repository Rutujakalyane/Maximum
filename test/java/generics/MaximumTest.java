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
}