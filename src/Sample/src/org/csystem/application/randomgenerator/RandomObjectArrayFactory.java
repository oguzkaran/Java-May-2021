package org.csystem.application.randomgenerator;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.datetime.Date;
import org.csystem.util.math.Fraction;
import org.csystem.util.math.geometry.Point;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class RandomObjectArrayFactory {
    private final Random m_random;

    //String, Fraction, Date, int [], Point
    private Object createObject()
    {
        Object object;

        switch (m_random.nextInt(5)) {
            case 0:
                object = StringUtil.getRandomTextTR(m_random, m_random.nextInt(10) + 1);
                break;
            case 1:
                object = new Fraction(m_random.nextInt(10) - 5, m_random.nextInt(10) + 1);
                break;
            case 2:
                object = Date.random(m_random);
                break;
            case 3:
                object = ArrayUtil.getRandomArray(m_random, m_random.nextInt(10) + 5, 0, 99);
                break;
            default:
                object = Point.createCartesian(m_random.nextInt(200) - 100, m_random.nextInt(200) - 100);
        }

        return object;
    }

    private Object [] fillObjects(Object [] objects)
    {
        for (int i = 0; i < objects.length; ++i)
            objects[i] = createObject();

        return objects;
    }

    public RandomObjectArrayFactory()
    {
        this(new Random());
    }

    public RandomObjectArrayFactory(Random random)
    {
        m_random = random;
    }

    public Object[] getObjects(int count)
    {
        return fillObjects(new Object[count]);
    }
}
