package generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    MaximumValue maximumValue = new MaximumValue();

    @Test
    public void findingMaxValue_FromGiven_ThreeIntegers_ByGeneric() {
        Integer maxValue = (Integer) maximumValue.maximum(8, 5, 3);
        Assert.assertEquals((Integer) 8, maxValue);
    }

    @Test
    public void findingMaxValue_FromGiven_ThreeFloats() {
        Float maxValue = (Float) maximumValue.maximum(5.5f,4.4f,8.8f);
        Assert.assertEquals((Float) 8.8f, maxValue);
    }

    @Test
    public void findingMaxValue_FromGiven_ThreeStrings() {
        String maxValue = (String) maximumValue.maximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach", maxValue);
    }
    @Test
    public void findingMaxValue_FromGiven_IntegerElements_ByGenericClass() {
        MaximumValue maximumValue = new MaximumValue();
        Object maxValue = (Object) maximumValue.maximum(3, 44, 66, 2, 11, 4, 66, 7, 8, 9, 100, 46, 113);
        Assert.assertEquals((Object) 113, maxValue);
    }

    @Test
    public void findingMaxValue_FromGiven_FloatElements_ByGenericClass() {
        MaximumValue maximumValue = new MaximumValue();
        Object maxValue = (Object) maximumValue.maximum(3.44f, 44.4f, 66.34f, 2.77f, 11.333f);
        Assert.assertEquals((Object) 66.34f, maxValue);
    }

    @Test
    public void findingMaxValue_FromGiven_StringElements_ByGenericClass() {
        MaximumValue maximumValue = new MaximumValue();
        Object maxValue = (Object) maximumValue.maximum("Peach", "Banana","Apple","Kiwi");
        Assert.assertEquals((Object) "Peach", maxValue);
    }


}

