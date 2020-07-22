package io;

public interface iData extends IReader,IPrinter {
    default int input(String text)
    {
        print(text);
        return read();
    }
}
