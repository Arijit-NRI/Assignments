
import java.util.Arrays;
import java.util.Iterator;
class GenericArray<T> {
    private T[] values;

    public GenericArray(T[] values) {
        this.values = values;
    }

	public String getClassName()
	{
		return (values.getClass().getSimpleName()).toString();	
	}

    public void displayValues() {
        Iterator<T> iterator = Arrays.asList(values).iterator();
        while (iterator.hasNext()) {
            System.out.print(" "+iterator.next()+" ");
        }
		System.out.println();
    }
}
public class GenericArrayExample
{
	public static void main(String[] args)
	{
		Integer[] intArray = {1, 2, 3, 4, 5};
		GenericArray<Integer> intObj = new GenericArray<Integer>(intArray);
		System.out.println("Printing value of obj of class -> "+ intObj.getClassName());
		intObj.displayValues();

		String[] stringArray = {"hello", "world"};
		GenericArray<String> stringObj = new GenericArray<String>(stringArray);
		System.out.println("Printing value of obj of class -> "+ stringObj.getClassName());
		stringObj.displayValues();

		Float[] floatArray = {1.0f, 2.5f, 3.14f};
		GenericArray<Float> floatObj = new GenericArray<Float>(floatArray);
		System.out.println("Printing value of obj of class -> "+ floatObj.getClassName());
		floatObj.displayValues();

		Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
		GenericArray<Double> doubletObj = new GenericArray<Double>(doubleArray);
		System.out.println("Printing value of obj of class -> "+ doubletObj.getClassName());
		doubletObj.displayValues();
	}
}
