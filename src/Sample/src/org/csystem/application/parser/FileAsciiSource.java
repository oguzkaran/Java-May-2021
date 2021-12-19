package org.csystem.application.parser;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAsciiSource implements ISource , Closeable {
    private FileInputStream m_fis;
    private final String m_path;

    public FileAsciiSource(String path) throws FileNotFoundException
    {
        m_path = path;
        m_fis = new FileInputStream(m_path);
    }

    public int nextChar() throws IOException
    {
        return m_fis.read();
    }

    public void reset() throws FileNotFoundException
    {
        m_fis = new FileInputStream(m_path);
    }

    public void close() throws IOException
    {
        m_fis.close();
    }
}
