
package com.compiler;

import org.junit.Test;


public class InterpreterTestMulDivTest extends StmtParserTestBase
{
    @Test
    public void testInterpreterMultiplication() throws Exception
    {
        String program = """
        {
          PRINT 3 * 4;
          PRINT 5 * 6;
        }
                """;
        testParser(program, "12\n30\n");
    }

    @Test
    public void testInterpreterDivision() throws Exception
    {
        String program = """
        {
          PRINT 10 / 2;
          PRINT 9 / 3;
        }
                """;
        testParser(program, "5\n3\n");
    }

    @Test
    public void testInterpreterMixedOperations() throws Exception
    {
        String program = """
        {
          PRINT 8 / 2 * 3;
          PRINT 6 * 2 / 3;
        }
                """;
        testParser(program, "12\n4\n");
    }

    @Test
    public void testInterpreterDivisionByOne() throws Exception
    {
        String program = """
        {
          PRINT 7 / 1;
        }
                """;
        testParser(program, "7\n");
    }

    @Test
    public void testInterpreterMultiplicationByZero() throws Exception
    {
        String program = """
        {
          PRINT 5 * 0;
        }
                """;
        testParser(program, "0\n");
    }
}
