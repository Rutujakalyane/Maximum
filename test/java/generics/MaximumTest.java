package generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_AtFirstPosition() {
        MaximumValue maximumValue = new MaximumValue();
        Integer maxValue = maximumValue.maximum(5, 8, 3);
        Assert.assertEquals((Integer) 5, maxValue);
    }
}