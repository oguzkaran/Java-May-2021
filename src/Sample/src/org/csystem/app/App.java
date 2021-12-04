/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte exception fırlatılması durumunda MathException sınıfının getMessage metodunun çağrıldığına
    dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String [] args)
	{
		try {
			double val = Console.readDouble("Bir sayı giriniz:");

			double result = MathUtil.myLog(val);

			System.out.printf("log(%.2f) = %f%n", val, result);
		}
		catch (Throwable ex) {
			System.out.printf("%s%n", ex.getMessage());
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class MathUtil {
	public static double myLog(double val)
	{
		if (val == 0)
			throw new MathException("val can not be zero", MathExceptionStatus.ZERO);

		if (val < 0)
			throw new MathException("val can not be negative", MathExceptionStatus.NEGATIVE);

		return Math.log(val);
	}
}

enum MathExceptionStatus {ZERO, NEGATIVE}

class MathException extends RuntimeException {
	private final MathExceptionStatus m_status;

	public MathException(String message, MathExceptionStatus status)
	{
		super(message);
		m_status = status;
	}

	public String getMessage()
	{
		return String.format("Message:%s, Error Status:%s", super.getMessage(), m_status);
	}

	public MathExceptionStatus getStatus()
	{
		return m_status;
	}
}
