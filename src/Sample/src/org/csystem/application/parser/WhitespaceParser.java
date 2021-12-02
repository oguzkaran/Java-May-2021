package org.csystem.application.parser;

public class WhitespaceParser extends Parser {
    private Source m_source;

    public WhitespaceParser()
    {
    }

    public WhitespaceParser(Source source)
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

    public int doParse()
    {
        m_source.reset();
        int count = 0;

        int ch;

        while ((ch = m_source.nextChar()) != -1)
            if (Character.isWhitespace(ch))
                ++count;

        return count;
    }
}
