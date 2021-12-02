package org.csystem.application.parser;

public abstract class Parser {
    private Source m_source;

    public Parser()
    {
    }

    public Parser(Source source)
    {
        //...
        m_source = source;
    }

    public Source getSource()
    {
        return m_source;
    }

    public void setSource(Source source)
    {
        //...
        m_source = source;
    }

    public abstract int doParse();
}
