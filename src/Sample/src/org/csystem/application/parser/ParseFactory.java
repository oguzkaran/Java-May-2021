package org.csystem.application.parser;

public class ParseFactory {
    //...
    public Parser getParser(ParserType parserType)
    {
        return parserType == ParserType.DIGIT ? new DigitParser() : new WhitespaceParser();
    }
    //...
}
