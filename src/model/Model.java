package model;

import io.IPrinter;
import io.iData;
import service.IService;

public class Model {
    int a, b, sum;

    public void init(iData data)
    {
        a=data.input("Enter a: ");
        b=data.input("Enter b: ");
    }

    public void calc(IService service){
        sum=service.calculate(a,b);
    }

    public void done(IPrinter printer)
    {
        printer.print("Result: ");
        printer.print(sum);
    }
}
