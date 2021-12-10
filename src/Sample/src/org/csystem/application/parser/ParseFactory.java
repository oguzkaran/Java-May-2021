package org.csystem.application.parser;

public class ParseFactory {
    //...
    public Parser getParser(ParserType parserType, ISource source)
    {
        return parserType == ParserType.DIGIT ? new DigitParser(source) : new WhitespaceParser(source);
    }
    //...
}
