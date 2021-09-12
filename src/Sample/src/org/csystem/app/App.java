/*----------------------------------------------------------------------------------------------------------------------
	Partition algoritması ve ArrayUtil sınıfının partition metodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

class App {
	public static void main(String [] args)
	{
		PartitionTest.run();
	}
}

class PartitionTest {
	public static void run()
	{

		int [] a = {3, -7, 8, 9, 19, 9, 8, 13};
		int threshold = 23;

		int partitionPoint = ArrayUtil.partition(a, threshold);

		System.out.printf("Partition Point:%d%n", partitionPoint);
		ArrayUtil.display(a);
	}
}

