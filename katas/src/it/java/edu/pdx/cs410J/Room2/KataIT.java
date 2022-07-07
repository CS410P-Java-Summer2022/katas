package edu.pdx.cs410J.Room2;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {
    @Test
    void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
        assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
    }

    @Test
    void invokeMainComputeFoo(){
        String test = "101";
        InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, test);
        assertThat(result.getTextWrittenToStandardOut(), containsString("1*1"));
    }

    @Test
    void invokeMainComputeBar(){
        String test = "303";
        InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, test);
        assertThat(result.getTextWrittenToStandardOut(), containsString("FooFoo*Foo"));
    }

    @Test
    void invokeTest(){
        String test = "105";
        InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, test);
        assertThat(result.getTextWrittenToStandardOut(), containsString("FooBarQix*Bar"));
    }

    @Test
    void invokeMainComputeQix(){
        String test = "10101";
        InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, test);
        assertThat(result.getTextWrittenToStandardOut(), containsString("FooQix**"));
    }
}
