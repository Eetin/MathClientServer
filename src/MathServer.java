import org.apache.thrift.TException;

/**
 * Created by Eetin on 06.03.2015.
 */
public class MathServer implements MathService.Iface {
    @Override
    public int add(int a, int b) throws TException {
        System.out.printf("Called add(%d, %d)=%d\n", a, b, a + b);
        return a + b;
    }

    @Override
    public int sub(int a, int b) throws TException {
        System.out.printf("Called sub(%d, %d)=%d\n", a, b, a - b);
        return a - b;
    }

    @Override
    public int mul(int a, int b) throws TException {
        System.out.printf("Called mul(%d, %d)=%d\n", a, b, a * b);
        return a * b;
    }

    @Override
    public int div(int a, int b) throws TException {
        System.out.printf("Called div(%d, %d)=%d\n", a, b, a / b);
        return a / b;
    }

    @Override
    public int mod(int a, int b) throws TException {
        System.out.printf("Called mod(%d, %d)=%d\n", a, b, a % b);
        return a % b;
    }
}
